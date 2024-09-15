package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement	outerFrame=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerFrame);
		
	    WebElement	innerIframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

	    driver.switchTo().frame(innerIframe);
	    
	    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Roshan");


	}

}
