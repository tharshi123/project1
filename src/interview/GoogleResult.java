package interview;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleResult {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("Java");
		e.submit();
		
		driver.manage().window().maximize();
		//WebElement result = driver.findElement(By.id("rhscol"));
		 WebElement searchPanel  = driver.findElement(By.id("search"));
		
		//System.out.println(searchResult.get(0).getText());
		
		
		PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/searchResult.txt",true));
		
		//for(int i=0; i<searchResult.size();i++) {
			//System.out.println(searchResult.get(i).getText());
			
			List <WebElement>  searchResult = searchPanel.findElements(By.tagName("a"));
			
			   for(int x=0; x<searchResult.size();x++)
			   {
				   	System.out.println(searchResult.get(x).getText());
				   	writer.println(searchResult.get(x).getAttribute("href"));
			   } 
		
		//}
		
		
		writer.close();
		
		
	}

}
