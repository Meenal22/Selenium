
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class inage {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/#");

		List<WebElement>Image=driver.findElements(By.tagName("Img"));
		System.out.println(Image.size());
		/*for(WebElement Imge:Image)
		{
			System.out.println(Imge.getText());
		}
	*/
		for(int i=0;i<=Image.size();i++)
		{ 
			System.out.println(Image.get(i).getAttribute("src"));
		}
	}
}
