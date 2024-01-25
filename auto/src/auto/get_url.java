package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_url {

	public static void main(String[] args) throws InterruptedException
	{

           System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.flipkart.com/");
           String url= driver.getCurrentUrl();
           System.out.println(url);
           //verify that user is launch correct url
           if(url.equalsIgnoreCase("https://www.flipkart.com/"))
           {
        	   System.out.println("taste case is passed");
           }else {
        	   System.out.println("taste case is failed");
           }
           Thread.sleep(2000);
           driver.quit();
           

	}

}
