import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
        driver.findElement(By.xpath("//input[@value='Milk']")).click();
        
        //driver.manage().timeouts().setScriptTimeout(100,SECONDS);

       
        
        int count1 = driver.findElements(By.xpath("//input[@name='group1']")).size();
       System.out.println("Number of radion buttons under group1 is:"+count1);
       
       RadioButton R= new RadioButton();
       
       R.selectRadioButtons(driver, count1);
       
        
	}
	
	private void selectRadioButtons(WebDriver drive,int buttonCount) throws InterruptedException
	{	  int x;
	     for(x=0; x<buttonCount; x++)
	     {
	    	 
	    	 WebElement  e =  drive.findElements(By.xpath("//input[@name='group1']")).get(x);
	    	 
	    	 String lable = e.getAttribute("value");
	    	 if(lable.equals("Cheese"))
	    		 e.click();
	    	 
	    	 Thread.sleep(2000L);
	    	 System.out.println(e.getAttribute("value"));
	    	 
	     }
	    	 
	} 
	
}