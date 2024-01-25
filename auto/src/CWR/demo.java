package CWR;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
        Thread.sleep(2000);
        

       driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click();
       
       driver.findElement(By.xpath("//a[contains(text(),\"1414 DEGREES LIMITED\")]")).click();
       
       List<WebElement>rowsize=driver.findElements(By.xpath("//table[@class=\"table table-nv\"]//tr"));
       int row=rowsize.size();
       System.out.println(row);
       
       List<WebElement>colsize=driver.findElements(By.xpath("//table[@class=\"table table-nv\"]//tr[2]/td"));
        int col=colsize.size();
        System.out.println(col);
        
        for(int i=1;i<=3;i++) {

           String data1=driver.findElement(By.xpath("//table[@class=\"table table-nv\"]//tbody/tr/th["+i+"]")).getText();
           System.out.print(data1+" ");
           
            }
       
        
	}

}
