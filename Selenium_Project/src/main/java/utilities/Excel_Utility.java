package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
	static FileInputStream file ;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	public static String readStringData(int row ,int column,String sheetname) throws IOException
	{
		file = new FileInputStream("C:\\Users\\user\\git\\Selenium-Basics\\Selenium_Project\\src\\main\\resources\\TestData.xlsx");
		book =new XSSFWorkbook(file);
		sheet =book.getSheet(sheetname);
		Row r = sheet.getRow(row);
		Cell c =r.getCell(column);
		return c.getStringCellValue();
		
	}
	public static String readIntegerData(int row , int column,String sheetname) throws IOException
	{
		file = new FileInputStream("C:\\Users\\user\\git\\Selenium-Basics\\Selenium_Project\\src\\main\\resources\\TestData.xlsx");
		book =new XSSFWorkbook(file);
		sheet =book.getSheet(sheetname);
		Row r = sheet.getRow(row);
		Cell c =r.getCell(column);
		int  a = (int) c.getNumericCellValue();
		return String.valueOf(a);
		
	}

}
