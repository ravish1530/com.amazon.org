

package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismulti {

	public static void main(String[] args) throws InterruptedException {
		

       System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
        
        Thread.sleep(3000);
        
         WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
         date.click();
         
         Select d=new Select(date);
         
         boolean output=d.isMultiple();
         if(output==true) {
        	 System.out.println("Test case passed: listbox is multiselectable");
        	 
         }else {
        	 System.out.println("Test case failed: listbox is single selectable");
         }
        
        
        

	}

}
