import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceTest {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        
        WebElement e1 = driver.findElement(By.id("username"));
        e1.sendKeys("Tharshi");
        driver.findElement(By.name("pw")).sendKeys("Loges123");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        		
        WebElement e2 =driver.findElement(By.cssSelector("div[id='error']"));
        String errormsg = e2.getText();
        System.out.println(errormsg);
        
        
        try {
       
        	PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Tharshini/Desktop/JavaOutput/oldfile.txt",true));
        
        	writer.println(errormsg+"\r\n");
        	writer.close();
        
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }	
        
        
        
       /* try {
            Files.write(Paths.get("C:/Users/Tharshini/Desktop/JavaOutput/oldfile.txt"), errormsg.getBytes(), StandardOpenOption.APPEND);
            Files.write(Paths.get("C:/Users/Tharshini/Desktop/JavaOutput/oldfile.txt"), "\r\n".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }	
        */
        
        
	}

}
