package TestCases;

import Base.TestBase;
import Pages.AccountCreatedPage;
import Pages.SignUpPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class AccountCreatedPageTest extends TestBase {
    public AccountCreatedPageTest() throws IOException {
        super();
    }
    AccountCreatedPage accountCreatedPage;

    @BeforeMethod
    public void beforeMethod() throws IOException {

        initialization();
        accountCreatedPage = new AccountCreatedPage();
    }

    @AfterMethod
    public void afterMethod(Method method , ITestResult result) throws IOException {
        tearDown();
    }

    @Test
    public void AccountCreated() throws IOException, InterruptedException {
        accountCreatedPage.AccountCreatedVisibleExist();
    }
}
