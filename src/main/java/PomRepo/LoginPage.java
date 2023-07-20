package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}

     @FindBy(id= "username")
     public WebElement usernameTextField;
     
     @FindBy(name = "pwd")
     public WebElement passwordtextField;
     
     @FindBy(xpath ="//div[text(='Login ']")
     public WebElement loginbutton;
     
     //Button Logic
     
     public void loginAction(String username, String password) {
    	 usernameTextField.sendKeys(username);
    	 passwordtextField.sendKeys(password);
    	 loginbutton.click();
     }
}
