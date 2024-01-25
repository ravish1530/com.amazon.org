package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class entertext_withoutsendkeys {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://phptravels.org/clientarea.php");
	        
	        JavascriptExecutor js=( JavascriptExecutor)driver;
	        js.executeScript("document.getElementById('inputEmail').value='myusername'");
	        js.executeScript("document.getElementById('inputPassword').value='mypassword'");

	}

}
