package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();
		
		
		Actions ac=new Actions(driver);
		
		ac.sendKeys(Keys.ESCAPE).perform();
		
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.UP).perform();
		Thread.sleep(3000);
	}

}
