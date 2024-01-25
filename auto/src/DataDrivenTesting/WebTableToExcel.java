package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableToExcel {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_by_population_(United_Nations)");
 
		String path=".\\datafiles\\population.xlsx";
		
		XLUtility2 xlutil=new XLUtility2(path);
		
		//write headers in excel sheet
		
		xlutil.setCellData("Sheet1", 0, 0, "Country");
		xlutil.setCellData("Sheet1", 0, 1, "UN continental region");
		xlutil.setCellData("Sheet1", 0, 2, "UN statistical subregion");
		xlutil.setCellData("Sheet1", 0, 3, "Population (1 July 2022)");
		xlutil.setCellData("Sheet1", 0, 4, "Population (1 July 2023)");
		xlutil.setCellData("Sheet1", 0, 5, "Change");
		
		//capture table rows
		
		WebElement table=driver.findElement(By.xpath("//table[@class='wikitable sortable static-row-numbers plainrowheaders srn-white-background jquery-tablesorter']/tbody"));
	
		int rows=table.findElements(By.xpath("tr")).size();//rows present in table
		
	for(int r=1;r<rows;r++) 
	{
			////table[@class='wikitable sortable static-row-numbers plainrowheaders srn-white-background jquery-tablesorter']/tbody/tr[1]/td[2]
		
		     // read data from web table
			String country=table.findElement(By.xpath("tr["+r+"]/td[1]")).getText(); 
			String continental=table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String subregion=table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String population2022=table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String population2023=table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
			String change=table.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
			
			System.out.println(country+continental+subregion+population2022+population2023+change);
	
	//writing data into excelsheet
			
			xlutil.setCellData("Sheet1", r, 0, country);
			xlutil.setCellData("Sheet1", r, 1, continental);
			xlutil.setCellData("Sheet1", r, 2, subregion);
			xlutil.setCellData("Sheet1", r, 3, population2022);
			xlutil.setCellData("Sheet1", r, 4, population2023);
			xlutil.setCellData("Sheet1", r, 5, change);
			
			
	}
		System.out.println("Web scraping is done succesfully.....");
		driver.close();
		
	}

}
