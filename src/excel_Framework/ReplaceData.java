package excel_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReplaceData {

	public static void replace() {
		
		try {
			FileInputStream in=new FileInputStream("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
			
			XSSFWorkbook work = new XSSFWorkbook(in);
			XSSFSheet sheet=work.getSheet("Sheet1");
			
			//XSSFRow r;
			XSSFCell c;
			
			for (int i = 0; i < 10; i++) 
			{
				if((sheet.getRow(5).getCell(0).getStringCellValue()).equals("Meenal"))
				{
					//sheet.getRow(5).getCell(0).setCellValue("PALASH");
					c=sheet.getRow(5).getCell(0);
					c.setCellValue("Palash");
					break;
				}
				
			}
			FileOutputStream out=new FileOutputStream("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
			work.write(out);
			work.close();
			in.close();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
