package interview;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		

		//Launching the site.				
		driver.get("http://demo.guru99.com/popup.php");			
		
		driver.findElement(By.xpath("//a[@target=\'_blank\']")).click();
		
		driver.manage().window().maximize();
		ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
		
		
		System.out.println(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.name("emailid")).sendKeys("jeyt@gmail.com");
		
		
		
		
	}

}
