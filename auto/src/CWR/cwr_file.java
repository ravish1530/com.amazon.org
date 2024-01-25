package CWR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cwr_file {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
          driver.manage().window().maximize();
          driver.get("https://www.bseindia.com/sensex/IndexHighlight.html");
          Thread.sleep(2000);
          
          List<WebElement>row=driver.findElements(By.xpath("//table[@ng-if=\"IndexHLght.RealTime.length > 0\"]//tr"));
          int rowsize=row.size();
          System.out.println(rowsize);
          
          List<WebElement>col=driver.findElements(By.xpath("//table[@ng-if=\"IndexHLght.RealTime.length > 0\"]//tr[2]/td"));
          int colsize=col.size();
          System.out.println(colsize);
         
          for(int i=1;i<12;i++) {
        	  String data1=driver.findElement(By.xpath("//table[@ng-if=\"IndexHLght.RealTime.length > 0\"]//thead/tr/td["+i+"]")).getText();
        	  System.out.println(data1+" ");
        	  
          }
          System.out.println();
          for(int i=1;i<=rowsize-1;i++) {
        	  String data2=driver.findElement(By.xpath("//table[@ng-if=\"IndexHLght.RealTime.length > 0\"]//tbody/tr["+i+"]/td")).getText();
        	  System.out.println(data2+" ");
          
              for(int j=1;j<=colsize;j++) {
        	 String data=driver.findElement(By.xpath("//table[@ng-if=\"IndexHLght.RealTime.length > 0\"]//tbody/tr/td")).getText();
        	  System.out.print(data+" ");
          }
          System.out.println();
          }
	}
}
          
          


	


