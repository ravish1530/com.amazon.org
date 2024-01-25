package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Linkedin"))
		{
			System.out.println("test case is passed");
		}else
		{
			System.out.println("test case is failed");
		}
		Thread.sleep(2000);
		  driver.close();
		
	}

}
