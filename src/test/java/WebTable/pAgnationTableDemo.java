package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pAgnationTableDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement>	row=driver.findElements(By.xpath("//div[@class='table-container']//table//tbody//tr"));
		System.out.println(row.size());



		for(int i=1; i<=row.size(); i++) 
		{	
			List<WebElement>	col=driver.findElements(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td"));
			System.out.println(col.size());
			for(int j=1; j<col.size(); j++) {

				WebElement  data= driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td["+j+"]"));
				System.out.print(data.getText() +"||");

				if (data.getText().equals("Smartwatch")) {

					driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td[4]//input")).click();
				}

				if (data.getText().equals("Tablet")) {

					driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td[4]//input")).click();
				}
			}
			
			

		}

		//		if (driver!=null) {
		//			
		//			driver.close();
		//		}
		System.out.println("==========================================");


		driver.findElement(By.xpath("//*[@id=\"pagination\"]/li[2]/a")).click();

		page2(driver);
	}
	
	public static void page2(WebDriver driver) 
	{
		List<WebElement>	row=driver.findElements(By.xpath("//div[@class='table-container']//table//tbody//tr"));
		System.out.println(row.size());



		for(int i=1; i<=row.size(); i++) 
		{	
			List<WebElement>	col=driver.findElements(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td"));
			System.out.println(col.size());
			for(int j=1; j<col.size(); j++) {

				WebElement  data= driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td["+j+"]"));
				System.out.print(data.getText() +"||");

				if (data.getText().equals("Television")) {

					driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td[4]//input")).click();
				}

				if (data.getText().equals("Gaming Console")) {

					driver.findElement(By.xpath("//div[@class='table-container']//table//tbody//tr["+i+"]//td[4]//input")).click();
				}
			}
			
		}
	}
}
