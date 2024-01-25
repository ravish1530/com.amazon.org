package table;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
        Thread.sleep(2000);
        
       // driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click();
        List<WebElement> row=driver.findElements(By.xpath("//table[@class=\"table\"]//tr"));
		int rowsize=row.size();
		System.out.println(rowsize);
		
		//get no of columns present in table
		List<WebElement> column=driver.findElements(By.xpath("//table[@class=\"table\"]//tr[2]/td"));
		int colsize=column.size();
		System.out.println(colsize);
		
		//Get table heading
		for(int k=1;k<=5;k++)
		{
			String data1=driver.findElement(By.xpath("//table[@class=\"table\"]//thead/tr/th["+k+"]")).getText();
			System.out.print(data1+" ");
		}
		System.out.println();
		
		//get data of whole table
		for(int i=1;i<=rowsize-1;i++)
			
		{
			//get data from first column which has heading
				String data2=driver.findElement(By.xpath("//table[@class=\"table\"]//tbody/tr["+i+"]/th")).getText();
				System.out.print(data2+" ");
				//get data from remaining column
				for(int j=1;j<=colsize;j++)
				{	
				
					String data=driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
				
				}
				System.out.println();
			}		

			


}
}