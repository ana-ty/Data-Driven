package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage{
	
	WebDriver driver;
	public DashBoardPage(WebDriver driver){
		
		this.driver=driver;
		
		}
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Dashboard ')]")
	WebElement DASHBOARD_HEADER_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[@href='https://techfios.com/billing/?ng=contacts/add/']") WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_FIELD_LOCATOR;

	
	
	public void validateDashBoardHeader() {
		
		
		waitForElement(driver,10, DASHBOARD_HEADER_FIELD);
		Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(),"Dashboard","Page not found!");
		
		}
     public void clickOnCUstomer() {
    	 
    	 CUSTOMER_FIELD_LOCATOR.click(); 
    	 
     }
     
     public void clickOnAddCustomer() {
    	 waitForElement(driver,5, ADD_CUSTOMER_FIELD_LOCATOR);
    	 ADD_CUSTOMER_FIELD_LOCATOR.click(); 
    	 
     }
	
}
