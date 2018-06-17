

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement d=driver.findElement(By.xpath("//*[@id=\'lst-ib\']"));
		d.sendKeys("java");
		d.sendKeys(Keys.RETURN);
		WebElement d2=driver.findElement(By.cssSelector("#lst-ib"));
		d2.clear();
		d2.sendKeys("Mother'sday");
		d2.sendKeys(Keys.RETURN);

	}

}
