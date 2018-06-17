package hjg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flighthub.com/");
		driver.manage().window().maximize();
		

		  WebElement destination = driver.findElement(By.xpath("//input[@placeholder='Going to']"));
		  destination.clear();  
		  destination.sendKeys("Punta Cana, Dominican Republic - Punta Cana International [PUJ]");
		
		
		driver.findElement(By.xpath("//span[@class=\'flights-home-pass-total\']")).click();
		driver.findElement(By.id("passenger-select-container")).click();
		
		//clicking + sign to increase the number of passenger.
		
		for (int i =0; i<4; i++) 
		{
			driver.findElement(By.xpath("//a[@data-action='increment']")).click();
		}
		
		

		
	
		driver.findElement(By.name("seg0_date")).click();
		WebElement monthPanel = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		monthPanel.click();
		System.out.println(monthPanel.getText());
		WebElement nextMonth = driver.findElement(By.xpath("//*[@id=\'datepicker\']/div/div[1]/a[2]"));
		

		////System.out.println(nextMonth.getText());
		//nextMonth.click();
		boolean nextMonthclick = true;
		
		do {
			
			
		    System.out.println(monthPanel.getText());
			if(monthPanel.getText().equals("August"))
			{
				monthPanel.click();
				nextMonthclick = false;
			
			}
			else 
			{ 
				nextMonth.click();
				monthPanel = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				//System.out.println(monthPanel.getText());
				nextMonth = driver.findElement(By.xpath("//*[@id=\'datepicker\']/div/div[1]/a[2]"));
			
			}
			
		}while(nextMonthclick);
		
		
		// selecting date
		WebElement datePanel  = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody"));
		List <WebElement> dateCollection = datePanel.findElements(By.tagName("td"));
		
		System.out.println(dateCollection.size());
		boolean dateSelected = true;
		int i =0;
		do
		{
			System.out.println(dateCollection.get(i).getText());
			if (dateCollection.get(i).getText().equals("10")) 
			{
				dateCollection.get(i).click();
				
				
			    driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
			    
			    System.out.println("fdfdsfdsf");
			    dateSelected = false;
			    
			    
			}  
			    
			i++;
			
			
		}while(dateSelected);
			
		 
		
				
		
		//driver.findElement(By.id("btn-search-flight")).click();
	 // driver.findElement(By.id("btn-search-flight")).click();
		
		
		
		//calling return date selector 
		System.out.println("I am calling returndate seletor");
		Calender C1= new Calender();
		
		
		C1.returnDate(driver,"15","September");
		
		
		
	 
	}
		
		//selecting return date
		public void returnDate (WebDriver driver, String date, String month)
		{
			 System.out.println("I am insight returndate seletor");
			  boolean searchMonth= true;
		      driver.findElement(By.name("seg1_date")).click();
	         
	          do {
	        	  WebElement pageMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	        	  System.out.println(pageMonth.getText());
	        	  
	        	  if(pageMonth.getText().equals(month)) {
	        		     System.out.println(pageMonth.getText());
	        		     searchMonth = false;
	        	  }
	        	  else
	        	  {
	        		  driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	        		  
	        	  }
	        	  
	        	  
	        	  
	        	  
	          }while (searchMonth);
	          
               return;
	    }
	    
	    
	    
	    

	

}
