package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JqueryDropDown {

	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	     driver =new ChromeDriver(options);
	      
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	       
	       driver.findElement(By.id("justAnInputBox")).click();
	       
	     // selectChoicevalue(driver,"choice 1");
	   //   selectChoicevalue(driver,"choice 2","choice 2 1","choice 6","choice 6 2 2");
	       
	      selectChoicevalue(driver,"all");
	}
	
	public static void selectChoicevalue(WebDriver driver,String... value ) {

		List<WebElement>choicelist=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist) {
				
				String text=item.getText();
				
				for(String val:value) {
					
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
			
		}
		else {
			
			try {
				for(WebElement item:choicelist) {
					
					item.click();
			}
			
				
			}catch(Exception e) {
				
			}
		}
}
}