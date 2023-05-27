import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginLogoutProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = setUp("chrome"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Loggged out");
		driver.close();
		
	}
	public static WebDriver setUp(String browsername) {		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\SeleniumPractise\\drivers\\chromedriver.exe");
			
			return new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","E:\\Workspace\\SeleniumPractise\\drivers\\chromedriver.exe");
			
			return new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "E:\\Workspace\\SeleniumPractise\\drivers\\chromedriver.exe");
			
			return new InternetExplorerDriver();
		}
		return null;
	}
}
