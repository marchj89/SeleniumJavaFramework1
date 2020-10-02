package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		getRowCount();
	}

	//Create a method named getRowCount
	public static void getRowCount() {

		try {

			String projectPath =  System.getProperty("user.dir");
			
			//Create an instance of the class
			XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");

			//Create a reference for our workbook
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			//Get the row count from the Excel file in Sheet1
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: "+rowCount);
			workbook.close();
		}
		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
