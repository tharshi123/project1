import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tharshi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   n
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Dowloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("hello word");
	    WebDriver  driver = new ChromeDriver();
	    
	    driver.get("http://www.workopolis.com");
	    

	}

}
