package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	
	public static void flash(WebElement element, WebDriver driver)
{
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String bgcolor=element.getCssValue("backgroundcolor");
		
		for(int i=0;i<700;i++) {
			changeColor("#000000", element,driver);
			changeColor(bgcolor, element, driver);
			
			
		}
		
}
	public static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundcolor= '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.border='3px solid red'", element);
	}
		
		

		
	
}
