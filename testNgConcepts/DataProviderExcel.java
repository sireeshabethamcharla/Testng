package testNgConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	@Test
	public void GetExcelData() throws Exception {
		File f = new File("./excel\\data.xlsx");
		System.out.println(f.exists());
		FileInputStream fis = new FileInputStream("./excel\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Data");
		int row = sheet.getLastRowNum(); 
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(col);
		for(int i=1;i<= row;i++) {
			String Uname = sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Uname+">>>>"+pwd);
		}
	}
}