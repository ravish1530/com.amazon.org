package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	    
              WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
              
              System.out.println("Location of min slider:"+min_slider.getLocation());
              System.out.println("Height & width of element:"+min_slider.getSize());
              
              Actions act=new Actions(driver);
              
              act.dragAndDropBy(min_slider, 110, 0).perform();
              
              System.out.println("Location of min slider:"+min_slider.getLocation());
              System.out.println("Height & width of element:"+min_slider.getSize());
              
              
              //2
              
              WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
              act.dragAndDropBy(max_slider, -100, 0).perform();
              
              System.out.println("Location of min slider:"+max_slider.getLocation());
              System.out.println("Height & width of element:"+max_slider.getSize());
              
              
              

              
	}

}
