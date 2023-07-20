package PomRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToVerifyTheHomePageTitle {

	public static void main(String[] args) {
		String expectedHomePageTitle="Enter";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login= new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
		
		String actualHomePageTitle = driver.getTitle();
		
		if(actualHomePageTitle.contains(actualHomePageTitle)) {
			System.out.println("fail: The home page title is not verified");
		}
	
	 
	   else
		System.out.println("Fail: The home page title is not verified");

}
}
