package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsize {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("C:\\HTML\\table.html");
	        
	        List<WebElement>row= driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr"));
	        int size=row.size();
	        System.out.println("no of rows in table:"+size);
	        

	}

}
