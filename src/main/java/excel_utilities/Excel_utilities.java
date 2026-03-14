package excel_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utilities {
	
	 File excel_File ;
	 XSSFWorkbook workbook;
	 FileInputStream fileInputStream;
	
 public XSSFSheet get_Sheet(String path,String sheetname) throws IOException{
	  excel_File = new File(System.getProperty("user.dir")+path);	
	  fileInputStream = new FileInputStream(excel_File);
	 workbook = new XSSFWorkbook(fileInputStream);
	 XSSFSheet sheet = workbook.getSheet(sheetname);
	 return sheet;
 
	 
	}
 
 public String get_value(XSSFSheet sheet, int row_number, int cell_number) {
	 
	 XSSFRow row = sheet.getRow(row_number);
	 XSSFCell cell = row.getCell(cell_number);
	 String value  =  cell.getRawValue();
	 
	 return value;
	 
	}
 
 public void close_workbook_and_stream() throws IOException{
	 
	 workbook.close();
	 fileInputStream.close();
	 
	 
 }

 

}

