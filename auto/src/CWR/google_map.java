package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_map {

	public static void main(String[] args) throws InterruptedException {

             System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
             
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             
             driver.get("https://www.google.co.in/maps/");
             
        //     driver.findElement(By.xpath("//input[contains(@id,\"searchboxinput\")]")).sendKeys("shiradi maharashtra");
          //   Thread.sleep(3000);
             
         //    driver.findElement(By.xpath("//button[contains(@id,\"searchbox-searchbutton\")]")).click();
         //    Thread.sleep(2000);
             
            driver.findElement(By.xpath("//img[contains(@src,\"//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png\")]")).click();
             Thread.sleep(2000);
             
             driver.findElement(By.xpath("//input[contains(@placeholder,\"Choose starting point, or click on the map...\")]")).sendKeys("jath,maharashtra");
             Thread.sleep(2000);
             
             driver.findElement(By.xpath("//input[@aria-label=\"Choose destination, or click on the map...\"]")).sendKeys("pune");
             Thread.sleep(2000);
             
             driver.findElement(By.xpath("(//button[contains(@class,\"mL3xi\")])[3]")).click();
             Thread.sleep(2000);
             
             
             
             
	}

}
