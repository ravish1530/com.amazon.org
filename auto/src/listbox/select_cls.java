package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_cls {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.facebook.com/");
	        
	        driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	        
	        Thread.sleep(3000);
	        
	         WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"] "));
	         date.click();
	         Select d=new Select(date);
	         d.selectByValue("7");
	         
	         WebElement day=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	         day.click();
	         Select m=new Select(day);
	         m.selectByVisibleText("Jan");
	       
	         WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
	         year.click();
	         Select y=new Select(year);
	         y.selectByVisibleText("2000");
	 		
	         
	         
	         
	        
	         
	         
	         
	        
	        
	       
		

	}

}
