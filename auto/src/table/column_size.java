package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class column_size {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("C:\\HTML\\table.html");
	        
	        List<WebElement>column= driver.findElements(By.xpath("//table[@id=\"’1234’\"]//td"));
	        int size=column.size();
	        System.out.println("no of column in table:"+size);
	        
	        int columnsize=driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr[3]//td")).size();
	        System.out.println("no of column in a row:"+columnsize);
	        

	}

}
