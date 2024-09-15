package SetUp;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/table%20(1).html");
		
		List<WebElement>  row=driver.findElements(By.xpath("//tbody//tr"));
		 
		List<WebElement> col=driver.findElements(By.xpath("//tbody//tr[1]//td"));
		
		System.out.println("Row Size"+row.size());//11
		
		System.out.println("Column Size"+col.size());
		
		for(int i=1;i<=row.size(); i++) 
		{
			
			for (int j =1; j<=col.size(); j++)
			{
				
				String  text=driver.findElement(By.xpath("//tbody//tr["+i+"]//td["+j+"]")).getText();   
				System.out.println(text);
				
			}
			
			
			   
		}
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
