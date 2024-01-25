package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	        Thread.sleep(2000);
	        
	        driver.switchTo().frame("iframeResult");
	        
	       WebElement field1= driver.findElement(By.xpath("//input[@id=\"field1\"]"));
	       field1.clear();
	       field1.sendKeys("welcome to java");
	       
	       WebElement button=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	       Actions act=new Actions(driver);
	       act.doubleClick(button).perform();
	       
	       
	        

	}

}
