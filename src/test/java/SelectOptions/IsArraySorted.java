package SelectOptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsArraySorted {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		
		Select sel=new Select(driver.findElement(By.name("country")));
		        
	
		
		  List<WebElement>   opt=sel.getOptions();
		  System.out.println(opt.size());
		 
		  
		  ArrayList temp=new ArrayList();
		  ArrayList original=new ArrayList();
		  
		  for(WebElement option:opt) 
		  {
			  temp.add(option.getText());
			  original.add(option.getText());
		  }
		  
		  
		  System.out.println("Original Options"+original);
		  System.out.println("Temporary Options"+temp);
		  
		  Collections.sort(temp);
		  
		  System.out.println("Original Options after sorting"+original);
		  System.out.println("Temporary Options after sorting"+temp);
		  
		if(original.equals(temp)) 
		{
		  System.out.println("Array Is Sorted");	
		}
		else 
			System.out.println("Array Is Not Sorted");
	}

}
