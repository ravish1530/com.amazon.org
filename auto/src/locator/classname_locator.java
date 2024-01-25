package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname_locator {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("C:\\HTML\\demo.html");
        Thread.sleep(2000);
        
        driver.findElement(By.className("123")).sendKeys("abc");
        Thread.sleep(2000);
        
        driver.findElement(By.className("234")).sendKeys("xyz");

	}

}
