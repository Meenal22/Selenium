import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class table {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
			
		String table="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String col="/td[";
		//List<WebElement>rows=table.findElements(By.tagName("td"));
		//System.out.println(rows.size());
		//row_count and column_count if no of rows n counts are not present
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				String rows=driver.findElement(By.xpath(table+i+"]"+col+j+"]")).getText();
				System.out.println(rows);
			}	
		}
		
		//Heelooo
		

	}

}
