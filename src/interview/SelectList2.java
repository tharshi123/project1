package interview;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		
		Select rooms  = new Select (driver.findElement(By.id("hotel-rooms-hp-hotel")));
		
		List <WebElement> roomList = rooms.getOptions();
		
		for(int i =0 ; i<roomList.size();i++) 
		{
			System.out.println(roomList.get(i).getText());
			
			if( roomList.get(i).getText().equals("6 Rooms"))
			{
				roomList.get(i).click();
			}
		}
		
			
			
			
			Select dropdown1 = new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
			System.out.println(dropdown1.toString());
			dropdown1.selectByIndex(3);
			
		}
		
		
		
		
	}


