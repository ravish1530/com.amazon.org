package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
	        Thread.sleep(2000);
	        
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
	        driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
	        driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("ravish");
	        driver.findElement(By.xpath("//input[@id=\"lname\"]")).clear();
	        driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("shine");
	        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	        

	}

}
