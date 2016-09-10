import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class secnd {
	
	public static void main(String args[]) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		
	//	List<WebElement>chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println(chkbox.size());
		//for(WebElement chk:chkbox)
		//for(int i=0;i<=chkbox.size();i++)
		//{
			//System.out.println(chkbox.get(i).getAttribute("name"));
		//}
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		
		
	}

}
