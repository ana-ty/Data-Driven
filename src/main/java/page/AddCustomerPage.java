package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
      this.driver= driver;
	
	}
	 
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='country']") 
	WebElement COUNTRY_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id='submit']") 
	WebElement SUBMIT_BUTTON_LOCATOR;
		
	String enteredName;
	public void insertfullName(String fullName) {
		int genNum = randomGenerator(999);
		enteredName = fullName + genNum;
		FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);
	}

	
	public void enterCompanyName(String CompanyName) {
		selectDropDown(COMPANY_FIELD_LOCATOR,CompanyName);
		
	}
	
	public void enterEmailAddress(String Email) {
		int genNum = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(genNum + Email);
	}
	
	public void enterPhoneNumber(String Phone) {
		int genNum = randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(Phone + genNum);
	}
	
	public void enterAddress(String Address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(Address);
	}
	
	public void enterCity(String City) {
		CITY_FIELD_LOCATOR.sendKeys(City);
	}
	public void enterCountryName(String Country) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, Country);
	}
	
	
	public void entertState(String State) {
		STATE_FIELD_LOCATOR.sendKeys(State);
	}
	
	public void enterZip(String Zip) {
		ZIP_FIELD_LOCATOR.sendKeys(Zip);
	}
	
	
	public void clickSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
		
	}
	
	
	
	
}
