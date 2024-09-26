package WindoHandels;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[onclick=\"myFunction()\"]")).click();
		
		
		 Set<String> handel=driver.getWindowHandles();
		 
		 System.out.println(handel.size());
		
		 for (String hand : handel) {
			
			 driver.switchTo().window(hand);
		}
		
	}

}
