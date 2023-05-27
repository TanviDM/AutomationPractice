import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = setUp("chrome"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.linkText("Login")).click();
		
		String ExpectedHomepageTitle= "actiTIME - Enter Time-Track";
		System.out.println("ExpectedTitle : " + ExpectedHomepageTitle);
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(ExpectedHomepageTitle));
		
		String ActualTitle = driver.getTitle();
		System.out.println("ActualTitle:"+ ActualTitle);
		
		if(ActualTitle.equals(ExpectedHomepageTitle)) {
			System.out.println("Homepage validation successuful,logout"); 
			driver.findElement(By.id("logoutLink")).click();
		}else
		{
			System.out.println("Homepage validation failed");
		}
		
		
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
