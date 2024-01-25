package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata_wholerow {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("C:\\HTML\\table.html");
	        
	        for(int i=1;i<=3;i++) {
	        	String rowdata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td["+i+"]")).getText();
	        	System.out.print(rowdata+" ");
	        }
	       /* String rowdata1=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td[1]")).getText();
			String rowdata2=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td[2]")).getText();
			String rowdata3=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td[3]")).getText();
			System.out.println(rowdata1+" "+rowdata2+" "+rowdata3);*/


	}

}
