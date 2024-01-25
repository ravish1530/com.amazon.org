package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class checkdropdown_sorted {

	public static void main(String[] args) {
	 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
	 
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.twoplugs.com/newsearchserviceneed");
	       
	     //  driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
	       
	   //    driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
	       
	     //  driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();
	       
	       WebElement drpElel=driver.findElement(By.name("category_id"));
	       
	       Select drpselect=new Select(drpElel);
	       
	       List<WebElement>options1=drpselect.getOptions();
	       
	       ArrayList orginalList=new ArrayList();
	       
	       ArrayList templist=new ArrayList();
	       
	       for(WebElement opt:options1) {
	    	   orginalList.add(opt.getText());
	    	   templist.add(opt.getText());
	    	   
	       }
	       
	       System.out.println("original List:"+orginalList);
	       System.out.println("Temp List:"+templist);
	       
	      Collections.sort(templist);//sorting
	      
	      System.out.println("original List:"+orginalList);
	       System.out.println("Temp List After Sorting:"+templist);
	       
	       if(orginalList.equals(templist)) {
	    	   
	    	   System.out.println("DropDown Sorted..");
	       }else {
	    	   System.out.println("DropDown Unsorted..");
	       }
	       
	      

	}

}
