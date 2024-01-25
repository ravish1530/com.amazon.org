package SeleniumPractice;



import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {

		
		
		String str="welcome122";
		
		System.out.println("original string:"+str);
		System.out.println("String without int:"+removeint(str));
		System.out.println("Removed Int:"+removechar(str));
		
	}
	
	public static String removeint(String str) {
		return str.replaceAll("[0-9]", "");
	}
	
	public static String removechar(String str) {
		
		StringBuilder removechar=new StringBuilder();
		
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
				removechar.append(c);
			}
		}
		return removechar.toString();
	}
}
