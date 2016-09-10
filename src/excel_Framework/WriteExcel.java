package excel_Framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public void write()
	{
		try {
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Meenal\\Desktop\\testdata.xlsx"));
			XSSFWorkbook work = new XSSFWorkbook();
			XSSFSheet sheet = work.createSheet("Sheet1");
			XSSFRow row;

			for (int i = 0; i < 10; i++) {
				row = sheet.createRow(i);
				row.createCell(0).setCellValue("Meenal");
			}
			work.write(out);
			work.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
