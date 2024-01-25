package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_innerframe2 {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	       
		driver.switchTo().frame("iframeResult");//switch to outer i frame
		driver.switchTo().frame(0);//switch to inner iframe
		
		System.out.println("Text present inside the inner frmae:"+driver.findElement(By.xpath("//h1")).getText());
	   
		driver.switchTo().parentFrame();//go to parent frame/outer frame
		
	String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		System.out.println("Text present in outer framne:"+text);
	}

}
