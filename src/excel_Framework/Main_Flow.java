package excel_Framework;

public class Main_Flow {

	public static void main(String[] args) {
		
		WriteExcel WE=new WriteExcel();
		WE.write();
		ReadExcel.read("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
		ReplaceData.replace();
		ReadExcel.read("C:\\Users\\Meenal\\Desktop\\testdata.xlsx");
		
	}

}
