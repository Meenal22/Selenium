import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;


public class cookies {

	public static void main(String[] args) {
		//jjjjjj
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.mirror.co.uk");
	Set<Cookie>cukies=driver.manage().getCookies();
	System.out.println(cukies.size());
	driver.manage().deleteAllCookies();
	
	cukies=driver.manage().getCookies();
	System.out.println(cukies.size());
	
	}

}
