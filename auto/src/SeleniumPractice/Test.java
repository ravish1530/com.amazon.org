package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64 (1)\\msedgedriver.exe");

	       WebDriver driver =new EdgeDriver(options);
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.flipkart.com");
	       Thread.sleep(3000);
	       System.out.println("Title of webpage: "+driver.getTitle());
	       Thread.sleep(3000);
	       System.out.println("current of url of webpage: "+driver.getCurrentUrl());
	       System.out.print(driver.getPageSource());
	       


	}

}
