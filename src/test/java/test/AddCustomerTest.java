package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import utill.BrowserFactory;
import utill.ExcelReader;






public class AddCustomerTest {
	
	WebDriver driver;
	
	ExcelReader exlReader = new ExcelReader("src\\main\\java\\testData\\TF_Data.xlsx");
    String userName = exlReader.getCellData("LoginInfo","UserName",2);
    String password = exlReader.getCellData("LoginInfo", "Password", 2);
    String fullName = exlReader.getCellData("AddContactInfo", "FullName", 2);
	String companyName = exlReader.getCellData("AddContactInfo", "CompanyName", 2);
	String email = exlReader.getCellData("AddContactInfo", "Email", 2);
	String phone = exlReader.getCellData("AddContactInfo", "Phone", 2);
	String address = exlReader.getCellData("AddContactInfo", "Address", 2);
	String city = exlReader.getCellData("AddContactInfo", "City", 2);
	String country = exlReader.getCellData("AddContactInfo", "Country", 2);
	String state = exlReader.getCellData("AddContactInfo", "State", 2);
	String zip = exlReader.getCellData("AddContactInfo", "Zip", 2);

	@Test

public void MyValidUserShouldBeAbleToAddCustomer(Object FULLNAME_FIELD_LOCATOR) {
	
	driver = BrowserFactory.init();
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.enterUserName(userName);
	loginPage.enterPassword(password);
	loginPage.clickSigninButton();
	
	DashBoardPage dashBoardPage = PageFactory.initElements(driver,DashBoardPage.class);
	dashBoardPage.validateDashBoardHeader();
	dashBoardPage.clickOnCUstomer();
	dashBoardPage.clickOnAddCustomer();
	
	
	AddCustomerPage addCustomerPage = PageFactory.initElements(driver,AddCustomerPage.class);
	addCustomerPage.insertfullName(fullName);
	addCustomerPage.enterCompanyName(companyName);
	addCustomerPage.enterEmailAddress(email);
	addCustomerPage.enterPhoneNumber(phone);
	addCustomerPage.enterAddress(address);
	addCustomerPage.enterCity(city);
	addCustomerPage.enterCountryName(country);
	addCustomerPage.entertState(state);
	addCustomerPage.enterZip(zip);
	addCustomerPage.clickSubmitButton();
	
	
	
	}
	
}
