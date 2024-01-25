package multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_practice {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://skpatro.github.io/demo/links/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
	        driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
	        driver.findElement(By.xpath("//input[@value=\"Download\"]")).click();
	        
	        String mainpage=driver.getWindowHandle();
	        
	        Set<String>childId=driver.getWindowHandles();
	        System.out.println(childId.size());
	        
	        for(String s:childId) {
	        	System.out.println(s);
	        	if(!s.equals(mainpage)) {
	        		driver.switchTo().window(s);
	        		Thread.sleep(2000);
	        		driver.close();
	        	}
	        }
	        driver.switchTo().window(mainpage);

	}

}
