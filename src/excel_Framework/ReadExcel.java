package excel_Framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	 static String pathLocation;
	
	public static void read(String path)
	{
		pathLocation = path;
		try {
			FileInputStream input = new FileInputStream(pathLocation);
		//	BufferedInputStream   br = new BufferedInputStream(input);
			XSSFWorkbook work = new XSSFWorkbook(input);
			XSSFSheet sheet = work.getSheet("Sheet1");

			for (int i = 0; i < 10; i++) {
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			}
			work.close();
			input.close();		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}


}
