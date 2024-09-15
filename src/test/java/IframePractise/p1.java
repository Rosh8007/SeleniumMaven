package IframePractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		driver.switchTo().frame("frm1");

		WebElement	dropDowns=driver.findElement(By.id("selectnav1"));

		Select sel=new Select(dropDowns);
		sel.selectByValue("https://www.hyrtutorials.com/search/label/Java");

		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.id("firstName")).sendKeys("Rosh");
		driver.findElement(By.id("lastName")).sendKeys("Awar");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm3");
		
		driver.findElement(By.id("name")).sendKeys("I've access to this frame");
		
		driver.switchTo().frame("frm1");
		
		
		
		Select sel1=new Select(driver.findElement(By.id("selectnav1")));
		sel1.selectByVisibleText("- SQL");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm3");
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.id("firstName")).sendKeys("Rosh");
		driver.findElement(By.id("lastName")).sendKeys("Awar");
		
		

	}

}
