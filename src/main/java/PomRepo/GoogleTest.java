package PomRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
		driver.get("https://www.google.com/");
		
		GooglePage google = new GooglePage(driver);
		google.googleSearchBox.sendKeys("Selenium");
		
		driver.navigate().refresh();
		
	    google.googleSearchBox.sendKeys("Automation");
		
	}

}
