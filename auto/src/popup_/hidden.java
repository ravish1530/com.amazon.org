package popup_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden {

	public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("ravish");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();

	}

}
