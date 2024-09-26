package Calender;

import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		String  text=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
	
		System.out.println(text);
		
		while(text.equalsIgnoreCase("December 2024")) 
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
		
		 List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for(WebElement dy:days) 
		{
			
			if (dy.getText().equals("22")) {
				
				System.out.println(dy.getText());
				dy.click();
			}
			
		}
		
	
	}

}
