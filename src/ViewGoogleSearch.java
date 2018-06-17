import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ViewGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.ca");
		WebElement e= driver.findElement(By.xpath("//*[@id=\'lst-ib\']"));
		e.sendKeys("JAVA");
		e.submit();
		List <WebElement> searchresult  = driver.findElements(By.id("search"));
		
		for(int i=0; i<searchresult.size();i++)
		{	
			System.out.println(searchresult.get(i).getText());
			
		}
		
		
				//(By.xpath("//*[contains(@id='SrchResLst_rptResult')]")

	}

}
