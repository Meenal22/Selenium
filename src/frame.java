import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class frame {
	
	public static void main(String args[])
	{
		//can not automate single element
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		List<WebElement> frme = driver.findElements(By.tagName("iframe"));
		System.out.println(frme.size());
		for(int i=0;i<=frme.size();i++)
		{
			driver.switchTo().frame(i);
		
			try{
					driver.findElement(By.id("page"));
					break;
				}
			catch (Exception e){
				driver.switchTo().defaultContent();
			}
		}
		
		
	}
}
