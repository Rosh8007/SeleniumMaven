package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
	    Set<Cookie>	  set=driver.manage().getCookies();
	    for (Cookie cook : set) {
			
	    	System.out.println(cook.getName());
	    	System.out.println(cook.getDomain());
	    	System.out.println(cook.getPath());
	    	System.out.println(cook.getSameSite());
	    	System.out.println(cook.getValue());
	    	System.out.println(cook.getClass());
	    	System.out.println(cook.getExpiry());
		}
	}

}
