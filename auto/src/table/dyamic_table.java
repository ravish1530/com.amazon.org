
package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyamic_table {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
	        Thread.sleep(2000);
	        

           driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click();
	        
	        List<WebElement>rowsize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr"));
	        int row=rowsize.size();
	        System.out.println("no of rows in table:"+row);
	        
	        List<WebElement>coulmsize=driver.findElements(By.xpath("//table[@class=\"table\"]//tr[2]/td"));
	        int column=coulmsize.size();
	        System.out.println("no of column in table:"+column);
	        
	        for(int k=1;k<=5;k++) {
	        	String data1=driver.findElement(By.xpath("//table[@class=\"table\"]//thead/tr/th["+k+"]")).getText();
	        	System.out.print(data1+" ");
	        }
	        System.out.println();
	        for(int i=1;i<row-1;i++) {
	        	String data2=driver.findElement(By.xpath("//table[@class=\"table\"]//tbody/tr["+i+"]/th")).getText();
	        	System.out.println(data2+" ");
	        
	        for(int j=1;j<column;j++) {
	       
				String data=driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data+" ");
	        }
	        System.out.println();
	        }
	        
	        
	}
}

	


	


