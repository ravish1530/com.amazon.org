package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flashing_element {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com/");
	        
	        driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
	        
	        //flashing
	         WebElement joinfree=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[2]"));

            // JavaScriptUtil.flash(joinfree, driver);
	
	       //draw method
             JavaScriptUtil.drawBorder(joinfree, driver);
             
             
	}

}
