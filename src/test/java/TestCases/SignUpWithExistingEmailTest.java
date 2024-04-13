package TestCases;

import Base.TestBase;
import Pages.SignUpPage;
import Pages.SignUpWithExistingEmail;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class SignUpWithExistingEmailTest extends TestBase {
    public SignUpWithExistingEmailTest() throws IOException {
        super();
    }

    SignUpWithExistingEmail signUpWithExistingEmail;


    @BeforeMethod
    public void beforeMethod() throws IOException {

        //initialization();
        signUpWithExistingEmail = new SignUpWithExistingEmail();
    }


    @Test
    public void signup_loginPageIsExist() throws IOException, InterruptedException {
        signUpWithExistingEmail.clicksignup_login();
        signUpWithExistingEmail.sendKeys_name("Ahmed");
        signUpWithExistingEmail.sendKeys_email("A7meed3lii7@gmail.com");
        signUpWithExistingEmail.ClickSignUpButton();
        Assert.assertTrue(signUpWithExistingEmail.EnterAccountIsExist());
        System.out.println(signUpWithExistingEmail.ErrorWord());
    }

}