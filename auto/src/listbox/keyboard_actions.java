package listbox;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        Actions act=new Actions(driver); 
        WebElement user=driver.findElement(By.xpath("//input[contains(@id,\"email\")]"));
        WebElement pass=driver.findElement(By.xpath("//input[contains(@id,\"pass\")]"));
        
        act.sendKeys(user,"hello").perform();
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        pass.click();
        
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,\"_9lsa\")]")).click();
        
        		
        
           
		


	}

}
