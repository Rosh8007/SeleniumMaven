package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>  row=driver.findElements(By.xpath("//table[@name='BookTable'][0]//tbody//tr"));

		for (int i=0; i<row.size(); i++) {
			
			List<WebElement>    colm=row.get(i).findElements(By.xpath("//tr"));
			
			for (int j = 0; j <colm.size(); j++) {
				
			String	 data =colm.get(j).getText();
		
			System.out.println(data);
			
			}
			
		}
		
		driver.close();
	}
}
