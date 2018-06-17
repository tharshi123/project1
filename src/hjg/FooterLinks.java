package hjg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		/*System.out.println("Number of links in this page: "+ allLinks.size());
		System.out.println("The links are: ");
		for(int i=0; i<allLinks.size(); i++)
		{  
			
			System.out.println(allLinks.get(i).getText());
			
		}
		
		*/
		FooterLinks FL = new FooterLinks();
		FL.pageLinks(driver);
		FL.linkOfFooter(driver);		
		

	}
	
	
	public void pageLinks(WebDriver driver)
	{
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in this page: "+ allLinks.size());
		System.out.println("The links are: ");
		for(int i=0; i<allLinks.size(); i++)
		{  
			
			System.out.println(allLinks.get(i).getText());
			
		}
		
		
		
	}
	
	
	public void linkOfFooter (WebDriver driver)
	{
		//taking panel as element
		WebElement panel = driver.findElement(By.id("gf-BIG"));
		
		//taking all links under a panel
		List <WebElement> footer= panel.findElements(By.tagName("a"));
		System.out.println("Numper of links is footer:"+footer.size());
		System.out.println("The actual footer links are:");
		for(int x= 0; x<footer.size(); x++)
		{
			System.out.println(footer.get(x).getAttribute("href"));
		}
	}
	
	

}
