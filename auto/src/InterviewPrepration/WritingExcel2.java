package InterviewPrepration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel2 {

	public static void main(String[] args) throws IOException {


		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Emp Info");
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[] {"EmpID","Name","Job"});
		empdata.add(new Object[] {101,"David","Engineer"});
		empdata.add(new Object[] {102,"Smith","Manager"});
		empdata.add(new Object[] {103,"Scott","Analyst"});
		
		
		//Using for each loop
		
		int rowcount=0;
		
		for( Object emp[]:empdata) {
			
			XSSFRow row=sheet.createRow(rowcount++);
			int colcount=0;
			
			for( Object value:emp) {
				XSSFCell cell=row.createCell(colcount++);
				
				if(value instanceof String)
					
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					
					cell.setCellValue((Boolean)value);
				
				
			}
		}

		String FilePath=".\\datafiles\\employee.xlsx";
		
		FileOutputStream stream=new FileOutputStream(FilePath);
		
		book.write(stream);
		
		stream.close();
		
		System.out.println("Employee file writeen successfuly");

	}

}
