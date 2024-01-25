package listbox;


import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shot {

	public static void main(String[] args) throws InterruptedException, IOException {

 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
            
         TakesScreenshot screen=(TakesScreenshot)driver;
         
         
		File src=screen.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\ravik\\OneDrive\\Pictures\\Screenshots\\first.jpg");
		FileHandler.copy(src, dest);
         

   
         

	}

}
