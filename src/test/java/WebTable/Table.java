package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {


	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().window().maximize();

		List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody//tr"));
		int rowSize=row.size();

		List<WebElement>tdata=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody//tr[1]//td"));

		int  dataSize=tdata.size();
		
		System.out.println("Data size :"+dataSize);

		for (int i = 1; i < rowSize; i++)
		{
			for (int j = 1; j <=dataSize; j++) {
				
				WebElement data=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody//tr["+i+"]//td["+j+"]"));

				System.out.print("  "+data.getText());
				
				if (data.getText().contains("India"))
				{
					System.out.println("I Found India at this row no :"+i + "Column No :"+j);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id='countries']/tbody/tr[78]/td[1]")).click();
				}
			}
			
			System.out.println();
		}


	}

}
