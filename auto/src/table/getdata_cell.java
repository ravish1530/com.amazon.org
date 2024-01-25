package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata_cell {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("C:\\HTML\\table.html");
	        
	        WebElement cell=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[4]/td[2]"));
	        
                  String celldata=cell.getText();
                  System.out.println(celldata);
                  
                  System.out.println(driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[5]/td[2]")).getText());
                  
	}

}
