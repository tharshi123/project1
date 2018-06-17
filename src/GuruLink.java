import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.name("cusid")).sendKeys("1234");
		 driver.findElement(By.name("submit")).click();
		 
		 
		 driver.manage().window().maximize() ;
	//	 driver.manage().

	       // Switching to Alert        
	////    Alert alert1 = driver.switchTo().alert();		
	  /////  System.out.println(alert1.getText());
	    	
	//	 alert1.accept();
		 
	////	 Alert alert2 = driver.switchTo().alert();
	////	 System.out.println(alert2.getText());
		 //alert2.getText();
	//	 alert2.accept();
		 
		 
		 
		// ze() ;
 		
	        
	        //Scoll down
	          
	          
	         //*** JavascriptExecutor js = (JavascriptExecutor) driver;
	          
	        // This  will scroll down the page by  1000 pixel vertical		
	      //  js.executeScript("window.scrollBy(0,1000)");
	        
		 
	}

}
