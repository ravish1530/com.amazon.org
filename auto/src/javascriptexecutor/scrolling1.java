

package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling1 {
	
  public static void main(String[] args) {


  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        
        JavascriptExecutor js=((JavascriptExecutor)driver);
        //1)scrolling by using pixel
       // js.executeScript("window.scrollBy(0,1000)", "");

      
        //2)scrolling page till we find element
     
       WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]"));
	  js.executeScript("arguments[0].scrollIntoView();", flag);
  
        //3)scroll page till bottom
       // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }

}
