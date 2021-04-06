package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD;
	@FindBy(how = How.XPATH, using ="//button[@name='login']") WebElement LOGIN_BUTTON;

	
	public void enterUserName(String userName) {
		USERNAME.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD.sendKeys(password);
	}

	public void clickSigninButton() {
		LOGIN_BUTTON.click();
	}
	

}  
 