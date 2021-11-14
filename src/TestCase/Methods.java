package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static WebDriver driver;
	
	//Launch Browser
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//Login functionality
	
	public void Login(String username , String password) {
		
		driver.get("https://giant-okapi.jurassic.ninja/wp-login.php");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();	
		driver.manage().window().maximize();
	}
	
	// Close Browser
	public void closeBrowser() {
		if(! driver.toString().contains("null")) {
			driver.close();
		}
	}
 

	public static void main(String[] args) {
		 
		Methods obj = new Methods();
		obj.launchBrowser();
		obj.Login("demo","7BrTrZIHgfLo");
		obj.closeBrowser();

	}

}
