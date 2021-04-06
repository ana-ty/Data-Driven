package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import utill.BrowserFactory;
import utill.ExcelReader;



public class LoginTest {
	
	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\Testdata\\TF_TestData.xlsx");
	String userName = exlread.getCellData("LoginInfo", "UserName", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);
	
	
	@Test
    public void MyvalidUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickSigninButton();
		
		DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardPage.validateDashBoardHeader();
		
		BrowserFactory.tearDown();
		
		}

	
	
}   
