package Cookies;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		Cookie addCookie=new Cookie("Name", "Roshan");

		driver.manage().addCookie(addCookie);

		Set<Cookie>	cookies=driver.manage().getCookies();

		ArrayList<Cookie>list=new ArrayList<Cookie>(cookies);

		for (Cookie cook : list) {

			System.out.println(cook.getName());
			System.out.println(cook.getPath());
			System.out.println(cook.getSameSite());
			System.out.println(cook.getDomain());
			System.out.println(cook.getClass());
			System.out.println(cook.getExpiry());
			System.out.println(cook.getValue());
		}


		

		Cookie   addedCookie=driver.manage().getCookieNamed("Name");

		String  name=addedCookie.getName();
		
		System.out.println(name);












	}

}
