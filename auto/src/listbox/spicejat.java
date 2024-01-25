package listbox;


import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class spicejat {

	public static void main(String[] args) throws InterruptedException {


		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		        
		        WebDriver driver=new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get("https://www.spicejet.com/");
		        driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
		        driver.findElement(By.xpath("//div[text()=\"BOM\"]")).click();
                Thread.sleep(2000);


                driver.findElement(By.xpath("//div[text()=\"Kishangarh Airport\"]")).click();
                Thread.sleep(2000);
                
              
                driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\"])[1]")).click();
                Thread.sleep(2000);
                
                driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
                WebElement el=driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
                int i=1;
                
                while(i<4) {
                	el.click();
                	i++;
                }
                
                
                driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
                driver.findElement(By.xpath("//div[text()=\"USD\"]")).click();
	}

}
