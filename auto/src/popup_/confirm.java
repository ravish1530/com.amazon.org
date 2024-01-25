package popup_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
        Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();
        
        WebElement out=driver.findElement(By.xpath("//div[@id=\"output\"]"));
        System.out.println(out.getText());
        

	}

}
