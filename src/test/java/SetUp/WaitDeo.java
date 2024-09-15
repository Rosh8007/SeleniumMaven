package SetUp;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDeo {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/login.php");

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.findElement(By.name("userName")).sendKeys("qqq");

		driver.findElement(By.name("password")).sendKeys("qqq");



		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement button =wb.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));

		button.click();
		
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	  WebElement	element=mywait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.name("submit"));
			}
			
		});
	  
	  element.click();
        
		
		
		
	}

}
