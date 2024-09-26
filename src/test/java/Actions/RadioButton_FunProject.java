package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_FunProject {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement>	  elements=driver.findElements(By.xpath("//*[@id='post-body-1307673142697428135']/div[4]//div"));

		for (WebElement webEl : elements) {
 
			if (!webEl.getText().equalsIgnoreCase("Sunday")) {
				
				webEl.click();
			}
			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		driver.quit();
	}

}
