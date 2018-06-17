

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.expedia.ca");
		
		
	//selecting List item from dropSystem.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		Select dropdown = new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
		dropdown.selectByIndex(4);
		//List noOfAdults = (List) dropdown.getOptions();
			
		WebElement e3= dropdown.getOptions().get(4);
	    System.out.println(e3.getText());
		List <WebElement> noOfAdults = dropdown.getOptions();
	    
	    for (int i=0;i<noOfAdults.size();i++)
	    {
	    	System.out.println(noOfAdults.get(i).getText());
	    }
	   
		
		
		
		//Select tabs = new  Select(driver.findElement(By.xpath("//span[@class='tab-label']")));
		
	 //  WebElement tabcount = tabs.getOptions().get(3);
	 //  tabcount.click();
	   
		//driver.findElement(By.xpath("//span[@data-control='uitk-icon'][3]")).click();
				
				
				
		
		
		
	}

}
