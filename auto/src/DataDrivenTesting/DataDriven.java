package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataDriven {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd, String exp)
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement textEmail=driver.findElement(By.id("Email"));
		textEmail.clear();
		textEmail.sendKeys(user);
		
		WebElement password=driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys(pwd);
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
		
		String expTitle="Dashboard / nopCommerce administration";
		
		String actTitle=driver.getTitle();
		
		if(exp.equals("Valid"))
		{
			if(expTitle.equals(actTitle)) {
				
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
		}
		else if(exp.equals("Invalid"))
		{
			if(expTitle.equals(actTitle)) {
				
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		/*String loginData[][]= {
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","adminas","Invalid"},
				{"adm@yourstore.com","admin","Invalid"},
				{"adm@yourstore.com","adm","Invalid"}
		
			   }; */
		
		//get the data from excel
		String path=".\\datafiles\\nopcommerce.xlsx";
		
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][]= new String[totalrows][totalcols];
		 
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData;
	}
	
	@AfterClass
	void tearDown() {
		
		driver.close();
	}
}
