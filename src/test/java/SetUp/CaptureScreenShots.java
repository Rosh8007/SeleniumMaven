package SetUp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();

		TakesScreenshot ts=(TakesScreenshot)driver;

		//Full Page Screenshot
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\HP\\Desktop\\SC\\sc.png"));

		
		
		
		driver.navigate().to("https://demo.nopcommerce.com/");

		WebElement section=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]"));

		FileUtils.copyFile(section.getScreenshotAs(OutputType.FILE), new File(".\\Screenshot\\portionOfPage.png"));

	}

}
