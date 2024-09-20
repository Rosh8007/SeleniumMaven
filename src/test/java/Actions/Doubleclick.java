package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclick {


	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement 	clickEl=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));

		Actions ac=new Actions(driver);
		ac.doubleClick(clickEl).build().perform();


		driver.quit();
	}

}
