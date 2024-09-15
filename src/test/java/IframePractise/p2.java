package IframePractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p2 {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Selenium");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement>  links=driver.findElements(By.xpath("//li//div[@class='wM6W7d WggQGd']//span"));
		
		System.out.println(links.toString());
		
		for(WebElement l:links) 
		{
			System.out.println(l.getText());
		}
	}

}
