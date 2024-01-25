package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveto_ele {

	public static void main(String[] args) throws InterruptedException {


		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		        
		        WebDriver driver=new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get("https://www.flipkart.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//button[contains(text(),\"✕\")]")).click();
		        
		     WebElement el=driver.findElement(By.xpath("//a[contains(text(),\"Login\")]"));
		        
		        Actions act=new Actions(driver);
		        act.moveToElement(el).perform();
		        Thread.sleep(2000);
		        
		        WebElement ele=driver.findElement(By.xpath("//div[contains(text(),\"Gift Cards\")]"));
		        act.click(ele).perform();
		        

	}

}
