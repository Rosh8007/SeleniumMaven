package SetUp;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Set<Cookie> cookies=driver.manage().getCookies();

		System.out.println("Size of Cookies"+cookies.size());

		for(Cookie cook:cookies) 
		{
			System.out.println(cook.getName()+":"+cook.getValue());
			System.out.println(cook.getDomain()+":"+cook.getExpiry());
		}

		Cookie name=driver.manage().getCookieNamed("i18n-prefs");

		System.out.println("Printing Cookie By Name"+name);

		Cookie cooki=new Cookie("Name", "Roshan");

		driver.manage().addCookie(cooki);

		Set<Cookie> cookies1=driver.manage().getCookies();

		System.out.println("Size of Cookies"+cookies1.size());

		for(Cookie cook:cookies1) 
		{
			System.out.println(cook.getName()+":"+cook.getValue());
			System.out.println(cook.getDomain()+":"+cook.getExpiry());
		}





	}
}
