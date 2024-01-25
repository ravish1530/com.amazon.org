package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	      driver =new ChromeDriver(options);
	      
	       //driver.manage().window().maximize();
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://formstone.it/components/dropdown/demo/");
	       
	       //approach 1
	       Select Label=new Select (driver.findElement(By.xpath("//select[@id=\"demo_basic\"]")));
	       
	       Select group=new Select(driver.findElement(By.xpath("//select[@id=\"demo_groups\"]")));
	       
	       Select delabel= new Select(driver.findElement(By.xpath("//select[@id=\"demo_label\"]")));
	       
	       //approach2
	       
	       WebElement basiclabel=driver.findElement(By.xpath("//select[@id=\"demo_basic\"]"));
	       selectOption(basiclabel,"One");
	       
	       WebElement Group=driver.findElement(By.xpath("//select[@id=\"demo_groups\"]"));
	       selectOption(Group,"Three");
	       
	       WebElement Delabel=driver.findElement(By.xpath("//select[@id=\"demo_label\"]"));
	       selectOption(Delabel,"Alaska");
	}

	public static void selectOption(WebElement ele,String value) {
		
		Select drp=new Select(ele);
		
		List<WebElement>alloptions=drp.getOptions();
		for(WebElement option:alloptions) {
			
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
		
	}
}
