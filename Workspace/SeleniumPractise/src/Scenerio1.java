import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;





public class Scenerio1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\SeleniumPractise\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String ExpectedURL= ("https://demo.actitime.com/");
		String ActualURL =	driver.getCurrentUrl();
		String PageTitle=driver.getTitle();
		System.out.println("Page Title : " +PageTitle);
		String pagetitlelength= driver.getTitle();
		System.out.println("Page Title length :"+pagetitlelength.length());
		
		
			
		System.out.println("Current URL :" + ExpectedURL);
		if(ActualURL.contains(ExpectedURL)){
			System.out.println("Status: Pass");
			
		}else
		{
			System.out.println("Status: Fail");
		}
		
		//Assert.assertEquals(URL,"https://demo.actitime.com/login.do");
		
		String pageSource=driver.getPageSource();
		//System.out.println("PageSouce of page "+driver.getPageSource());
		System.out.println("PageSouce of page "+ pageSource.length());
		
		driver.close();
		
		
		
	}

}
