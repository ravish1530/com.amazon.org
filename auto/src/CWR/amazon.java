

package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(@href,\"/gp/bestsellers/?ref_=nav_cs_bestsellers\")]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(@href,\"/gp/most-gifted/ref\")]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[contains(@title,\"Urban Forest Rakhi Gift Hamper for Brother - Classic Black Men's Leather Wallet, Black Keyring and Rakhi Combo Gift Set for Brother - 4558\")]")).click();
        Thread.sleep(3000);
        
	}

}
