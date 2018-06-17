import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		MakeMyTripTest  myTrip = new MakeMyTripTest();
				
		myTrip.searchTrips_validInputs_expectedOutput(driver);
		
		//driver.close();
		
	}
	

    public void tescaseName_inputConditions_expectedOutput(WebDriver driver){
    	
    	
    	
    }
    
	public void searchTrips_validInputs_expectedOutput(WebDriver driver) throws InterruptedException{
		
		WebElement from = driver.findElement(By.id("hp-widget__sfrom"));
		from.click();
		from.clear();
		//WebElement to = driver.findElement(By.id("widget__sTo"));
		//to.click();
		//to.clear();
		
		//List <WebElement> fromAutoList = driver.findElements(By.xpath("//li[@class=ui-menu-item"));
		//System.out.println(fromAutoList.get(2).toString());
		
    	
    	from.sendKeys("col");
    	//Thread.sleep(2000l);
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	
    	//Explicid wait
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);

    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-autocomplete-category']")));

    	System.out.println(driver.findElement(By.xpath("//li[@class='ui-autocomplete-category']")).getText());
    	
    	from.sendKeys(Keys.DOWN);
    	from.sendKeys(Keys.ENTER);
				
    	// driver.get("http://demo.guru99.com/test/delete_customer.php
    	
    	
    	
	}
	
	
	
	
	

}
