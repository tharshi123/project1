package interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("sale");
		e.submit();
		
		WebElement searchPanel = driver.findElement(By.id("search"));
	
		List <WebElement> searchResult = searchPanel.findElements(By.tagName("a"));
		
		PrintWriter pr = new PrintWriter (new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/searchResult2.txt",true));
		
		
		for(int i =0; i<searchResult.size();i++)
		{
			System.out.println(searchResult.get(i).getAttribute("href"));
			pr.println(searchResult.get(i).getAttribute("href"));
			
		}
		
		pr.close();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tharshini\\Desktop\\JavaOutput\\searchResult2.txt"));
		String line= "";
		int i =0;
		ArrayList <String> rows=new ArrayList<>();
		
		
		while( (line =br.readLine())!= null) {
			
			
			rows.add(line);
			i++;
			
		}
		br.close();
		PrintWriter writer2 = new PrintWriter (new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/copyresult.txt", true));
		
		for(int x=0; x<rows.size(); x++)
		{
			writer2.println(rows.get(x));
		}
		//C:\\Users\\Tharshini\\employee5.csv
		writer2.close();
	}

}
