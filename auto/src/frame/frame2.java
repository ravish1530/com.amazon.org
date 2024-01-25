package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");
        Thread.sleep(2000);
        
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
        
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input")).sendKeys("hii");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        
        WebElement an=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
        an.click();
        Select s=new Select(an);
        s.selectByVisibleText("Big Baby Cat");
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).clear();
	}

}
