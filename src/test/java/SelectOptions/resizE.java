package SelectOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class resizE {
	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement  resize=driver.findElement(By.cssSelector("[class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", resize);

	
		Actions ac=new Actions(driver);
        ac.clickAndHold(resize).moveByOffset(100,10).release().perform();
	
	}

}
