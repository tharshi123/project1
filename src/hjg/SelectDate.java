package hjg;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flighthub.com");
		driver.manage().window().maximize();
		WebElement calender = driver.findElement(By.name("seg0_date"));
		calender.click();
		// <WebElement> calender1= driver.findElements(By.id("modal_mobile_container"));
		//System.out.println(calender1.get(1).getText());

		
		SelectDate S1 = new SelectDate();
		
		System.out.println("calling month picker");
		S1.monthPicker(driver,"August");
		S1.datePicker(driver, 2018, 7, 28);
		
	}
	 public void datePicker(WebDriver driver, int year, int month, int date)
	 {
		     int date2 = date;
		    
		     
		    WebElement a=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody"));			 
			List<WebElement> asa= a.findElements(By.tagName("td"));
			for (WebElement test : asa)
			{				
				////System.out.println(test.getText());
				if(test.getText().equals(Integer.toString(date2)))
				{
					System.out.println("correctdate"+test.getText());
					
					test.click();
					return;
					
				}
					
				
			}
	 }
		
			
		public void monthPicker(WebDriver driver, String mon)
		{
			//String  month1; 
		  System.out.println(mon);
		 
		 
		  boolean correctMonth = true;
		  
		  
		  do
		  {
			  WebElement month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			  System.out.println(month.getText());
			  if(month.equals(mon))
			  {
				  month.click();
				  correctMonth= false;
			  }
			  else 
			  {
				  System.out.println("clicking next");
				  driver.findElement(By.xpath("//a[@data-event=\'click\']")).click();
				  correctMonth = true;
			  }
		  } while(correctMonth);
			  
		  
		  
		}
		
			
			

}
	
	
	


