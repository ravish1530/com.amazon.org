package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class list {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.facebook.com/");
	        
	        driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	        
	        Thread.sleep(3000);
	        
	        WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	        day.click();
	        
	        //select
	        Select se = new Select(day);
	        
	       // se.selectByIndex(12);
	       // se.selectByValue("14");
	        se.selectByVisibleText("17");
	        
	        

	}

}
