package Tootip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
	    String	text=driver.findElement(By.id("age")).getAttribute("title");
	    
	    System.out.println(text);
	}

}
