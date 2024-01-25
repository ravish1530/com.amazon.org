package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException
	{

             System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.navigate().to("https://www.booking.com/");
             driver.get("https://www.facebook.com/");
             driver.get("https://www.microsoft.com/");
             driver.get("https://twitter.com/");
             Thread.sleep(2000);
             driver.navigate().back();
             Thread.sleep(2000);
             driver.navigate().forward();
             Thread.sleep(2000);
             driver.navigate().refresh();
             Thread.sleep(2000);
             driver.quit();
             

	}

}
