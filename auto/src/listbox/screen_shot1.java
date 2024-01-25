package listbox;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shot1 {
	
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

        

		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        Thread.sleep(5000);
			screenshot("applicationopened");
			//script to select From city and to city
			driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]//input")).click();
			driver.findElement(By.xpath("//div[text()=\"BOM\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()=\"GOI\"]")).click();
			Thread.sleep(2000);
			screenshot("Originisselected");
			//script is to close calender
			driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"])[1]")).click();
			Thread.sleep(2000);
			
			//script to add passengers
			driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
			Thread.sleep(2000);
			WebElement adult=driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
			int i=1;
			while(i<5)
			{
				adult.click();
				i++;
			}
			WebElement child=driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
			WebElement infant= driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
			for(int j=1;j<3;j++)
			{
				child.click();
			}
			Thread.sleep(2000);
			for(int k=1;k<4;k++)
			{
				  infant.click();
			}
			Thread.sleep(2000);
			screenshot("passengerisselected");
			
			//script to add currency
			driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();
			screenshot("currencyisselected");


}
	public static void screenshot(String filename) throws IOException {

		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ravik\\OneDrive\\Pictures\\Screenshots\\"+filename+" .jpg");
		FileHandler.copy(src, dest);
		
	}
}