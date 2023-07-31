package testNgConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProviderCreateExcel {
	@Test
	public void CreateExcel() throws Exception {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("LoginData");
		String path = "./excel\\excel.xlsx";
		
		Object obj[][] = {
						 {"UserName","Password"},
						 {"Admin","admin123"},
						 {"Test","test123"}
		};
		int row = obj.length;
		int col = obj[0].length;
		System.out.println(row+">>>>"+col);
		for(int i=0; i<row;i++) {
			XSSFRow rows = sheet.createRow(i);
			for(int j=1;j<col;j++) {
				XSSFCell cell = rows.createCell(col);
				Object value = obj[i][j];
				System.out.println(value);
				if(value instanceof String) {
					cell.setCellValue((String) value);
				}
				if(value instanceof Integer) {
					cell.setCellValue((Integer) value);
				}
				if(value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}
			}
			
		}
		FileOutputStream fout = new FileOutputStream("./excel\\excel.xlsx");
		wb.write(fout);
		
	}


}
