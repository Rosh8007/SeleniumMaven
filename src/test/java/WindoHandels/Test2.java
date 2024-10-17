package WindoHandels;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul//li//a"));

		for(WebElement link:links) 
		{

			String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);  // Use Keys.COMMAND for Mac
			link.sendKeys(openInNewTab);
			Thread.sleep(1000);

		}

		   Set<String> handels=driver.getWindowHandles();

		   for(String hand:handels) 
		   {
			   driver.switchTo().window(hand);
		   }

	}

}
