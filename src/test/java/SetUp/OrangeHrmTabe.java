package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmTabe {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		// WebElement frame=driver.findElement(By.xpath("//iframe[@src='new-tab-sample.php']"));

		driver.switchTo().frame("SingleFrame");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Roshan");



	}

}
