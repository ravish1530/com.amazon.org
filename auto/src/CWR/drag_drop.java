package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	        Thread.sleep(2000);
	        
	        WebElement rome=driver.findElement(By.id("box6"));
	        
	        WebElement italy=driver.findElement(By.id("box106"));
	        Actions act=new Actions(driver);
	        
	        act.dragAndDrop(rome, italy).perform();
	        
	        

	}

}
