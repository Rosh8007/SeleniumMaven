package JavascriptEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		 WebElement   fname=driver.findElement(By.name("firstName"));
		
		js.executeScript("arguments[0].value='Roshan'", fname);
		
		 WebElement  lname=driver.findElement(By.name("lastName"));
		 
		 js.executeScript("arguments[0].value='Aware'", lname);
		
	}

}
