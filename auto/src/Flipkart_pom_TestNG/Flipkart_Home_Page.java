package Flipkart_pom_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Home_Page {


	@FindBy(xpath="//div[contains(text(),\"Ravikumar\")]")private WebElement username;

	
	public Flipkart_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateusername() throws InterruptedException {
		Thread.sleep(2000);
		String actual=username.getText();
		return actual;
	}
	


         
         
		
	}
	

