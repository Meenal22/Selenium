import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;


public class mouseOper {

	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println(args[0]);
		if(args[0].equals("Meenal"))
		{
			System.out.println("name");
		}
		else{
			System.out.println("surname");
		}
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.in/");
		Actions a1=new Actions(driver);
		Thread.sleep(1000);
		WebElement w1=driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]"));
		a1.moveToElement(w1).build().perform();
		w1.click();
	
		//right click
		WebElement w2=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		a1.contextClick(w2).build().perform();
		//double click	a1.contextClick().doubleClick();
*/
	}

}
