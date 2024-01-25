package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class image_drag_drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        Thread.sleep(2000);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
        
        WebElement item1=driver.findElement(By.xpath("//h5[text()=\"High Tatras\"]"));
        WebElement item2=driver.findElement(By.xpath("//h5[text()=\"High Tatras 2\"]"));
        
        WebElement trash=driver.findElement(By.xpath(" //div[@id=\"trash\"]"));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(item1, trash).perform();
        act.dragAndDrop(item2, trash).perform();
        
        

        
	}

}
