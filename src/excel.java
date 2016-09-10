import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
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
	
	public void read()
	{
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
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
	
	public static void replace() {
		
		try {
			FileInputStream in=new FileInputStream("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
			
			XSSFWorkbook work = new XSSFWorkbook(in);
			XSSFSheet sheet=work.getSheet("Sheet1");
			
			XSSFRow r;
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

	public static void main(String[] args) throws IOException {

		excel e1 = new excel();
		e1.write();
		System.out.println("FIRST Write Done");		
		excel e2 = new excel();
		e2.read();
		System.out.println("Read Write Done");
		excel.replace();
		System.out.println("Upadted");
		e2.read();
		
		
	}
}