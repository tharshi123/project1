package hjg;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First java");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vgerard\\Downloads\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.flighthub.com/");
		driver1.manage().window().maximize();	
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click Depart
		driver1.findElement(By.xpath("//div[@data-locale-departure='Depart']")).click();
		
		//Select Depart date
		BasicTest test = new BasicTest();
		test.selectDepartDate(driver1, "August", "10");
	
		//Select returndate date
		
		driver1.findElement(By.xpath("//div[@data-locale-return='Pick a Date']")).click();
		test.selectDepartDate(driver1, "August", "22");
		
		//close the broeser
		driver1.close();
		}
	
	public void selectDepartDate(WebDriver driver1,String month,String date) {
		WebElement monthElement=driver1.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		
		while(!monthElement.getText().equalsIgnoreCase(month)) {
			//click on the next button
			driver1.findElement(By.xpath("//a[@data-handler='next']")).click();
			//get the current month now (which is July)
			monthElement=driver1.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			}
		
		//Now get the current date
		WebElement tbody=driver1.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody"));
		//Get the list of all dates which is inside the td tag
		List<WebElement> dates=tbody.findElements(By.tagName("td"));
		//Iterate through all dates until you find 15
		for(WebElement web: dates) {
			
		
			if(web.getText().equals(date)) {	
				web.click();
				break;
			}
		}
		
	}
}


