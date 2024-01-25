package POM_DDF_TestNG_withmandatory_classes;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 

{
     public static String fetchdata(int rowIndex, int cellIndex) throws IOException {
    	 
    	 FileInputStream file=new FileInputStream("C:\\Automation\\parameterise\\demo.xlsx");
         XSSFWorkbook book=new XSSFWorkbook(file); 
         XSSFSheet sh=book.getSheet("Sheet3");
         String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
         return data;
         
     }
     
     
     public static void screenshot(WebDriver driver,String filename) throws IOException {
    	 
    	 TakesScreenshot s=(TakesScreenshot)driver;
    	 File src=s.getScreenshotAs(OutputType.FILE);
    	 File des=new File("C:\\Automation\\parameterise\\"+filename+".jpg");
    	 FileHandler.copy(src, des);
    	 
    	 
    	 
     }
	
}
