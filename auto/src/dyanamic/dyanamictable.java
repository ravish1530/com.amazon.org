package dyanamic;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dyanamictable {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);      
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        
        driver.get("https://demo.opencart.com/admin/index.php"); 
        //login
        WebElement username=driver.findElement(By.id("input-username"));
        username.clear();
        username.sendKeys("demo");
        
        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("demo");
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//button[@class=\"btn-close\"]")).click();
        
        //sales-->orders
        driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
        
        //table
        //1)find total number of pages in table
       String str= driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
       System.out.println(str);//Showing 1 to 10 of 37 (4 Pages)
       
       //indexOf() nd substring()
      int total_pages=Integer.valueOf(str.substring(str.indexOf("(")+1,str.indexOf("Pages")-1));
      
      System.out.println("Total number of pages:"+total_pages);
      
      //2)find how many rows exists in each pages
      for(int p=1;p<=total_pages;p++) {
    	  
    	  try
    	  {
    		  WebElement active_page=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"pagination\"]//li//span")));
    		  System.out.println("Active Page:"+active_page.getText());
    		  active_page.click();
    	  }
    	   catch(org.openqa.selenium.ElementClickInterceptedException  e)
    	  {
               System.out.println("ElementClickInterceptedException occurred: " + e.getMessage());

    	  }
    	 
    	  
    	  
    	int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
       System.out.println("Number of Rows:"+rows);
       
       
     //3)read all the rows from each page
         for(int r=1;r<=rows;r++) 
         {
      	  String order=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
      	  String store=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
      	  Thread.sleep(2000);
      	  String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
      	  String status=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody/tr["+r+"]/td[5]")).getText();
             
      	if(status.equals("Pending")) {
      		 System.out.println(order+"   "+store+"   "+customer+"   "+status);
      	}
      	  
      	 
      	  
              
      	  
         }
         
       
       
       
       
       Thread.sleep(3000);
       String pageno=Integer.toString(p+1); 
       try
       {
    	  WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"pagination\"]//li/a[text()='"+pageno+"']")));
              ele.click();
       }
      catch(org.openqa.selenium.ElementClickInterceptedException  e)
       {
            System.out.println("ElementClickInterceptedException occurred: " + e.getMessage());

       }
    
           
      } 
       
         
            

      }
      
}  
     
      
      
      
      
       
       
        

	
	

