package listbox;

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
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        Thread.sleep(3000);
	        
	       
	        
	        WebElement el=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	        Actions act=new Actions(driver);
	        act.doubleClick(el).perform();

	}

}
