package Practice;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	
	public static void draderwBor(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
   public static  String getTitleByJS(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
 	}
	
   public static void clickElementByJS(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].click();", element);
	}
	
   public static void generateAlert(WebDriver driver, String message) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("alert('" +message+ "')");
	}
   
   public static void refreshBrowserByJS(WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("history.go(0)");
	}
   
   public static void scrollpageDown(WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
   
   public static void scrollpageUp(WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
   public static void zoomPageByJS(WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("document.body.style.zoom='50%'");
	}
   

   public static void flash(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changeColor("#000000",element, driver);//1
			changeColor(bgcolor,element, driver);//2
			
			
		}
   }
		 
   private static void changeColor(String color, WebElement element, WebDriver driver) {
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].style.backgroundColor = '"+ color+ "'", element);
	   
	   try {
		   Thread.sleep(30);
	   }catch(InterruptedException e) {
		   
	   }
	
}
   
   
	
}
