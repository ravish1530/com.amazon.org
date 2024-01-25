package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getselect_first {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	        
	        Thread.sleep(3000);
	        
	         WebElement mo=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	         mo.click();
	         
	         Select d=new Select(mo);
	         
	         d.selectByVisibleText("Jul");
	         
	         String expreslt="Jul";
	         
	         String Actreslt=d.getFirstSelectedOption().getText();
	         System.out.println(Actreslt);
	         if(expreslt.equalsIgnoreCase(Actreslt)) {
	        	 System.out.println("test case passed");
	         }else {
	        	 System.out.println("test case failed");
	         }

	}

}
