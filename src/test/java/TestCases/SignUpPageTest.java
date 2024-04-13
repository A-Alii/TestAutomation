package TestCases;

import Base.TestBase;
import Pages.MainPage;
import Pages.SignUpPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;

public class SignUpPageTest extends TestBase {
    public SignUpPageTest() throws IOException {
        super();
    }

    SignUpPage signUpPage;

    @BeforeSuite
    public void beforeSuite() throws IOException{
        initialization();
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {

        //initialization();
        signUpPage = new SignUpPage();
    }



    @Test
    public void signup_loginPage() throws IOException, InterruptedException {
        signUpPage.clicksignup_login();
        signUpPage.sendKeys_name("Ahmed");
        signUpPage.sendKeys_email("ahme.dli123@gmail.com");
        signUpPage.ClickSignUpButton();
        Assert.assertTrue(signUpPage.EnterAccountIsExist());
        System.out.println(signUpPage.EnterAccountTitle());
        signUpPage.TitleCheckBoxClick();
        signUpPage.sendKeys_Password("Zqweasdzxc!=1");
        signUpPage.BirthDate("25", "July", "1999");
        signUpPage.NewsLetterCheckBox();
        signUpPage.ReceiveOfferCheckBox();
        signUpPage.sendKeys_FName("Ahmed");
        signUpPage.sendKeys_LName("Ali");
        signUpPage.sendKeys_Company("Air Defense");
        signUpPage.sendKeys_Address1("123sdc_66s");
        signUpPage.sendKeys_Address2("59d-dss-s55");
        signUpPage.CountryDropDown("India");
        signUpPage.sendKeys_State("Cairo");
        signUpPage.sendKeys_City("Giza");
        signUpPage.sendKeys_ZipCode("12918");
        signUpPage.sendKeys_MobileNumber("01006139107");
        signUpPage.ClickCreateAccountButton();
        signUpPage.AccountCreatedVisibleExist();
        signUpPage.ClickContinueButton();
        signUpPage.ClickLogOutAccountContinueButton();
        //signUpPage.ClickDeleteAcount();
        //signUpPage.ClickDeleteAccountContinueButton();
    }






}
