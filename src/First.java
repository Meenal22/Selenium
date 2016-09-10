import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
	
	public static void main(String args[]) {
		
		FirefoxDriver fd1 = new FirefoxDriver();
		fd1.get("http://www.mercurytravels.co.in");
		fd1.manage().window().maximize();
		//Values of drop down
		/*	WebElement w1=fd1.findElement(By.id("frm:searchForm:departTime0"));
		List<WebElement>dropdown=w1.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<=dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}
		for(WebElement dropdownlst: dropdown)
		{
			System.out.println(dropdownlst);
		}
		*/	
	/*	List<WebElement>dropdowns=fd1.findElements(By.tagName("select"));
		
		for (int j=0;j<=dropdowns.size();j++)
		{
			System.out.println(dropdowns.get(j).getText());
		}
		
		for(WebElement dropdownlst: dropdowns)
		{
			System.out.println(dropdownlst.getText());
		}
		
		fd1.findElement(By.xpath("//*[@id='frm:searchForm:journeytype']/tbody/tr/td/label/input")).click();
	*/	
		//count radio button n values print
		List<WebElement>radio=fd1.findElements(By.xpath("//input[@type='radio']"));
			//List<WebElement>radio=fd1.findElements(By.xpath("//*[@class='triptype']"));
		
		for (int k=0;k<=radio.size();k++)
		{
			System.out.println(radio.get(k).getAttribute("value")+ " "+radio.get(k).getAttribute("checked"));
			
		}

		
	}

}
