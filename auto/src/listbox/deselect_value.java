package listbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_value {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("C:\\HTML\\demo.html");
        Thread.sleep(2000);
        
        WebElement el=driver.findElement(By.xpath("//select[@multiple=\"true\"]"));
        el.click();
        Select se=new Select(el);
        se.selectByIndex(0);
        se.selectByIndex(2);
        se.selectByIndex(3);
        Thread.sleep(2000);
        
        se.deselectAll();
        Thread.sleep(2000);

	}

}
