package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata_wholecolumn {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("C:\\HTML\\table.html");
	        for(int i=1;i<=5;i++) {
	        	
	        	if(i==1) {
	        		String headcolumdata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]/th[2]")).getText();
	        		System.out.println(headcolumdata);
	        	}
	        	else {
	        		String columdata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]//td[2]")).getText();
	        		System.out.println(columdata);
	        	}
	        }

	}

}
