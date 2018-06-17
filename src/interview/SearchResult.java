package interview;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResult {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("QA");
		driver.findElement(By.name("q")).submit();
		
		WebElement resultPanel = driver.findElement(By.id("search"));
		List <WebElement> search = resultPanel.findElements(By.tagName("a"));
		
		//System.out.println("hi");
		////for(int i =0;i<search.size(); i++)
	//	{
	//		System.out.println(search.get(i).getAttribute("href"));
			
	//	}
		
		PrintWriter writer4 = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile8.txt",true));
		
		
		for(int i=0; i<search.size();i++)
		{
			
		    String url = search.get(i).getAttribute("href");
			
		    if(url.contains("wiki")){
				System.out.println(url);
				writer4.println(url);
				
				
			}
			 
			 
		}
				
		writer4.close();
	

		
	}

}
