package TestCases;

import Base.TestBase;
import Pages.ContactUsPage;
import Pages.LoginPageInvalid;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContactUsPageTest extends TestBase {
    public ContactUsPageTest() throws IOException {
        super();
    }

    ContactUsPage contactUsPage;

    @BeforeMethod
    public void beforeMethod() throws IOException {
        //initialization();
        contactUsPage = new ContactUsPage();
    }

    @Test
    public void ContactUs() throws IOException, InterruptedException{
        contactUsPage.clickContactUsButton();
        contactUsPage.SendKeys_Name("Ahmed");
        contactUsPage.SendKeys_Email("ahmed@gmail.com");
        contactUsPage.SendKeys_Subject("Hello");
        contactUsPage.SendKeys_Message("bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla");
        String filePath = System.getProperty("user.dir") + "\\src\\test\\Source\\Screenshot 2024-04-06 211713.png";
        contactUsPage.SendKeys_Upload(filePath);
        contactUsPage.clickSubmitButton();
        contactUsPage.okButtonClick();
        Assert.assertEquals(contactUsPage.SuccessWord(), "Success! Your details have been submitted successfully.");
        contactUsPage.clickHomeButton();
    }


}
