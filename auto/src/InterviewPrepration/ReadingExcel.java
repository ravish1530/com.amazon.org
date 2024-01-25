package InterviewPrepration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	
	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\datafiles\\CountryDetails.xlsx";
		
		 FileInputStream inputstream=new FileInputStream(excelFilePath);
		 
		 XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		 
		// XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		 XSSFSheet sheet=workbook.getSheetAt(0);
		 
		 // using for loop read data 
		 
		/* int rows=sheet.getLastRowNum();
		 int col=sheet.getRow(1).getLastCellNum();
		 
		 for(int r=0;r<=rows;r++)
			
		 {
			 XSSFRow row=sheet.getRow(r);
			 
			 for(int c=0;c<col;c++)
			 {
				XSSFCell cell= row.getCell(c);
				
				switch (cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
				
				System.out.print(" | ");
			 }
			 
			 System.out.println();
		 }*/
		 
		 //// Iterator approach simple to use///
		 
		 Iterator iterator= sheet.iterator();
		 
		 while(iterator.hasNext())
		 {
			  XSSFRow row=(XSSFRow) iterator.next(); 
			  
			  Iterator cellIterator= row.cellIterator();
			  
			  while(cellIterator.hasNext()) 
			  {
				  
				XSSFCell cell=  (XSSFCell) cellIterator.next();
				
				switch (cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
				
				System.out.print(" | ");
			  }
			  
			  System.out.println();
		 }
		 
				
				
	}
}
