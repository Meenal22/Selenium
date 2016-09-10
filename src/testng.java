import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	FirefoxDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	}
	
	@Test 
	public void testthis()
	{
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
	
	@Test 
	public void testthis1()
	{
		List<WebElement>Image=driver.findElements(By.tagName("Img"));
		System.out.println(Image.size());
	}
	
	/*@AfterMethod
	public void exit()
	{
		driver.quit();
	}*/
}
