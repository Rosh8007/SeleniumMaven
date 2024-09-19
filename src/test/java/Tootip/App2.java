package Tootip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement   ageEle=driver.findElement(By.id("age"));
		

		Actions ac=new Actions(driver);
		
		ac.moveToElement(ageEle).perform();
		
		String  tooltip=ageEle.getAttribute("title");
		
		System.out.println(tooltip);
		
		driver.quit();
	}

}
