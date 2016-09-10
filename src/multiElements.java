import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class multiElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/#");
		List<WebElement>Elements=driver.findElements(By.tagName("Img"));
		System.out.println(Elements.size());
		Elements.addAll(driver.findElements(By.tagName("a")));
		System.out.println(Elements.size());
	}

}
