package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	 

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	        Thread.sleep(2000);
	        
	        WebElement button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	        Actions act=new Actions(driver);
	        act.contextClick(button).perform();//right click action
	        
	        
	        

	}

}
