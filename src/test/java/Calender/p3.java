package Calender;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p3 {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();

		WebElement   months=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//div//select[1]"));

		Select sel=new Select(months);
		sel.selectByValue("11");

		WebElement yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		new Select(yr).selectByValue("2022");


		List<WebElement> tRow=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//tr"));
		List<WebElement> tdata=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//tr[1]//td"));

		System.out.println(tRow.size());
        System.out.println(tdata.size());

		for (int i = 1; i <=tRow.size(); i++) {

			for (int j = 1; j <=tdata.size(); j++) {
				
				System.out.println("currently in"+i+":"+j);

				WebElement data=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//tr["+i+"]//td["+j+"]"));
				System.out.println(data.getText());
				
				if (data.getText().equals("29")) {
					
					System.out.println("I've selected :"+ data.getText());
					data.click();
				}

			}
		}
	}
}
