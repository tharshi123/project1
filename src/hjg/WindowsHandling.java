package hjg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		

		//Launching the site.				
		driver.get("http://demo.guru99.com/popup.php");			
	    driver.manage().window().maximize();		
	    String MainWindow=driver.getWindowHandle();
	    System.out.println(MainWindow);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();	


	/*	//Normal for loop

		for (int i = 0; i < myArray.length; i++) {
		    System.out.println(myArray[i]);
		}

		//enhanced for loop
		for (int myValue : myArray) {
		    System.out.println(myValue);
		}*/

		
		//get curret window

		 String mainWindow1=driver.getWindowHandle();	

		//System.out.println(mainWindow1.toString());
		System.out.println("Current Window URL: " + driver.getCurrentUrl());		

		

		Set <String>  winHandle= driver.getWindowHandles();
		//driver.switchTo().window(winHandle);

		 //Set set = new HashSet(Arrays.asList(elements));
		  //  Iterator<String> iter = winHandle.iterator();
		  //  while (iter.hasNext()) 
		  //  {
		  //  	System.out.println(iter.next());
		       // driver.switchTo().window(iter.next());
		 //   }
		    
		    
		    //arraylist 
		    ArrayList <String> tabs = new  ArrayList(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    
		    
		    
		    System.out.println("switiching to 2nd tab.."+ driver.getCurrentUrl());
		    
		    driver.findElement(By.name("emailid")).sendKeys("jeytharshi@gmail.com");
		    driver.findElement(By.name("btnLogin")).click();
		    System.out.println(driver.getCurrentUrl());
		    
	
		    }
			
			
	
		
	}

