import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Workspace\\SeleniumPractise\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.manage().window().setSize(new Dimension(700 ,500));
		
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().forward();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		driver.navigate().to("https://www.google.com/");
		
		
	}

}
