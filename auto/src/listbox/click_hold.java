package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_hold {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/drag_drop.html");
	        Thread.sleep(2000);
	        
	        List<WebElement>el=driver.findElements(By.xpath("//a[@class=\"button button-orange\"]"));
	        WebElement drag=el.get(1);
	        WebElement drop=driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));
	        
	        Actions act=new Actions(driver);
	        act.clickAndHold(drag).perform();
	        Thread.sleep(2000);
	        act.moveToElement(drop).release().build().perform();

	}

}
