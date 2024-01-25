package popup_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_alert {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
	       Thread.sleep(9000);
	        Alert a=driver.switchTo().alert();
	        System.out.println(a.getText());
	        
	        a.accept();
	        
	        
	        
	        

	}

}
