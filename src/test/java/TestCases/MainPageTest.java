package TestCases;

import Base.TestBase;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class MainPageTest extends TestBase {


    public MainPageTest() throws IOException {
        super();
    }

    MainPage mainpage;


    @BeforeMethod
    public void beforeMethod() throws IOException {

        initialization();
        mainpage = new MainPage();
    }

    @AfterMethod
    public void afterMethod(Method method , ITestResult result) throws IOException {
        tearDown();
    }

    @Test
    public void signup_loginPage() throws IOException, InterruptedException {
        mainpage.clicksignup_login();
        Assert.assertTrue(mainpage.wordExist());
    }


    /*@Test(priority = 1)
    public void getLogin() throws IOException, InterruptedException {
        mainpage.clicklink();
        Assert.assertTrue(mainpage.wordExist());

    }*/

    /*@Test(priority = 2)
    public void getAutor() throws IOException, InterruptedException {
        mainpage.getAutor();
        Assert.assertTrue(mainpage.wordE());

    }*/


}
