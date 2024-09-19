package Slider;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {



	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement	slider=driver.findElement(By.cssSelector("[class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		
		Actions ac=new Actions(driver);
		
		
		ac.dragAndDropBy(slider, 300, 0).perform();



	}

}
