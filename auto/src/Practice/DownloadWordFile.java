package Practice;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWordFile {

	public static void main(String[] args) {

		String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		//Chrome
		
		HashMap prefer=new HashMap();
		prefer.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefer);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver(options);
	       
	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	              
	       driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
	       driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
	     //  driver.findElement(By.xpath("//div[@id=\"dismiss-button\"]")).click();
	     driver.switchTo().alert().dismiss();
	  
	}

}
