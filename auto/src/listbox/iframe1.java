package listbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");
        Thread.sleep(2000);
        
        
	}

}
