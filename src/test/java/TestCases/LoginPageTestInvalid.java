package TestCases;

import Base.TestBase;
import Pages.LoginPageInvalid;
import Pages.LoginPageValid;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class LoginPageTestInvalid extends TestBase {
    public LoginPageTestInvalid() throws IOException {
        super();
    }

    LoginPageInvalid loginPageInvalid;

    @BeforeMethod
    public void beforeMethod() throws IOException {

        //initialization();
        loginPageInvalid = new LoginPageInvalid();
    }

    @Test
    public void loginPage() throws IOException, InterruptedException{
        loginPageInvalid.clicksignup_login();
        loginPageInvalid.LoginEmailAddressSendKeys_name("ali123@gmail.com");
        loginPageInvalid.LoginPasswordSendKeys_name("Zqwec!=1");
        loginPageInvalid.clickOnLoginButton();
        loginPageInvalid.errorLoginInvalid();
        System.out.println("***************");
        System.out.println(loginPageInvalid.errorLoginInvalidWord());
        System.out.println("***************");
    }
}
