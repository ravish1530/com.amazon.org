package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable1 {

	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("https://www.selenium.dev/ecosystem/");
	       
	       //1)find how many rows in table
	       
	     int rows=  driver.findElements(By.xpath("(//table[@class=\"table\"])[1]/tbody/tr")).size();
	      System.out.println("Total Number Of Rows in a Table:"+rows);//8
	      
	      //2)Find How Mnay columns in a table
	    int column=  driver.findElements(By.xpath("(//table[@class=\"table\"])[1]/thead/tr/th")).size();
	      System.out.println("Total Number Of Column in a Table:"+column);//3
	      
	      //3)Retrieve the specific row nd column data
	      
	     String value= driver.findElement(By.xpath("(//table[@class=\"table\"])[1]//tr[3]//td[1]")).getText();
	      System.out.println("The Value is:"+value);
	      
	      //4) Retrieve all the data from table
	      
	      System.out.println("Data From the table.....");
	      for(int r=1;r<=rows;r++) {
	    	  for(int c=1;c<column;c++) {
	    		  
	    		  String data= driver.findElement(By.xpath("(//table[@class=\"table\"])[1]//tr["+r+"]//td["+c+"]")).getText();
	    	      System.out.print(data+"    "+"  " );
	    	       
	    		  
	    	  }
	    	  System.out.println();
	      }
	      
	      
	      //5)print Language, author of hs-webdriver
	      
	      for(int r=1;r<=rows;r++) {
	    	  
    		  String language= driver.findElement(By.xpath("(//table[@class=\"table\"])[1]//tbody/tr["+r+"]/td[1]")).getText();

    		  if(language.equals("Haskell")) {
    			  
        		  String author= driver.findElement(By.xpath("(//table[@class=\"table\"])[1]//tbody/tr["+r+"]/td[2]")).getText();
  
    			  System.out.println("Author of book:"+language+"  "+author);
    		  }
	      }

	      driver.quit();

	}

}
