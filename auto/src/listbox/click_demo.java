package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_demo {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         Thread.sleep(2000);
         
         Actions act=new Actions(driver);
         
         act.contextClick(driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"))).perform();
         for(int i=0;i<4;i++) {
        	 act.sendKeys(Keys.ARROW_DOWN).perform();
         }
         act.sendKeys(Keys.ENTER).perform();
         

	}

}
