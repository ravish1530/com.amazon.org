package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
        Thread.sleep(2000);
        
        driver.switchTo().frame("iframeResult");
        
        driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("hello");
        




	}

}
