import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkopolisLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		
		driver3.get("http://www.workopolis.com");
		WebElement keyWord= driver3.findElement(By.id("keyword"));
		keyWord.sendKeys("Java");
		keyWord.sendKeys(Keys.TAB);
		
		WebElement location = driver3.findElement(By.id("location"));
		
		location.sendKeys("Toronto");
		//driver3.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver3.findElement(By.xpath("//*[@id=\'ui-id-51\']")).sendKeys(Keys.ARROW_DOWN);
		location.sendKeys(Keys.ARROW_DOWN);
		driver3.findElement(By.id("main-search-submit")).click();
		WebElement header = driver3.findElement(By.id("h1PageTitle"));
		String headerTitle = header.getText();
		System.out.println("Page title is: " + headerTitle);
		WorkopolisLogin work = new WorkopolisLogin();
		System.out.println("Test Case is :"+ work.correctTitle(headerTitle));
		driver3.findElement(By.id("sr-create-alert")).click();
		
		WebElement e2 = driver3.findElement(By.xpath("//*[@id=\"modal-email\"]"));
		e2.sendKeys("jeytharshi@gmail.com");
		//scroll down
		//driver3scr
		driver3.findElement(By.id("analytics_CreateAlertBtnModal")).click();;
		
		// reading confirmation message
		WebElement e3 = driver3.findElement(By.xpath("//*[@id=\"careerAlertFormAnon\"]/div[2]"));
		String confirmation = e3.getText();
		
		   work.isCareerAlertCreated(confirmation);
		 System.out.println("confirmation msg: " + confirmation);
	
	}
	
	public boolean correctTitle (String title)
	{
	        String ExpectedTitle = "Java Jobs In Toronto";
			if (title.equals(ExpectedTitle))
				return true;
						
		    else
		    	return false;
		    			
					
	}

	public void isCareerAlertCreated( String actualConfirmation)
	{  
		if (actualConfirmation.equals("Done! If you don't see an email from us soon, please check your junk mail folder."))
			
				System.out.println("Career alert is created sucessfully!!!");
		else
				System.out.println("Caree alert is not craeted!!!");

	
	}
}
