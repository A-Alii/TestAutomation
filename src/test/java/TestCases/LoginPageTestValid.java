package TestCases;

import Base.TestBase;
import Pages.LoginPageValid;
import Pages.MainPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class LoginPageTestValid extends TestBase {
    public LoginPageTestValid() throws IOException {
        super();
    }

    LoginPageValid loginPage;

    @BeforeMethod
    public void beforeMethod() throws IOException {
        //initialization();
        loginPage = new LoginPageValid();
    }


    @Test
    public void loginPage() throws IOException, InterruptedException{
        loginPage.clicksignup_login();
        loginPage.LoginEmailAddressSendKeys_name("ahme.dli123@gmail.com");
        loginPage.LoginPasswordSendKeys_name("Zqweasdzxc!=1");
        loginPage.clickOnLoginButton();
        loginPage.clickOnDeleteAccount();
        loginPage.clickOnContinueButton();
    }
}
