package TestCases;

import Base.TestBase;
import Pages.AllProductsPage;
import Pages.LoginPageInvalid;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AllProductsPageTest extends TestBase {
    public AllProductsPageTest() throws IOException {
        super();
    }
    AllProductsPage allProductsPage;

    @BeforeMethod
    public void beforeMethod() throws IOException {
        //initialization();
        allProductsPage = new AllProductsPage();
    }
    @Test
    public void AllProducts() throws IOException, InterruptedException{
        System.out.println(allProductsPage.Words());
        Assert.assertEquals(allProductsPage.Words(), "Home");
        allProductsPage.ClickOnProductButton();
        allProductsPage.AllProductsVisible();
        System.out.println(allProductsPage.AllProductsVisible());
        allProductsPage.SendKeys_Search("Blue Top");
        allProductsPage.ClickOnSearch();
        allProductsPage.ClickOnViewProduct();
        allProductsPage.ClickOnAddToCart();
        allProductsPage.ClickOnViewCart();
        Assert.assertEquals(allProductsPage.ProductNameWord(), "Blue Top");
        System.out.println(allProductsPage.ProductNameWord());
        allProductsPage.ClickOnProcessedToCheckOut();
        allProductsPage.ClickOnRegister_Login();
        allProductsPage.LoginEmailAddressSendKeys_name("ahmedali@gmail.com");
        allProductsPage.LoginPasswordSendKeys_name("AhmedAli123");
        allProductsPage.clickOnLoginButton();
        allProductsPage.clickOnCart();
        allProductsPage.ClickOnProcessedToCheckOut();
        allProductsPage.clickOnPlaceOrderButton();
        allProductsPage.SendKeys_CardName("Ahmed Ali Mahmoud");
        allProductsPage.SendKeys_CardNumber("1234567899874");
        allProductsPage.SendKeys_CardCvc("111");
        allProductsPage.SendKeys_Expiration("25");
        allProductsPage.SendKeys_Year("2025");
        allProductsPage.clickOnSubmitButton();
        allProductsPage.clickOnContinueButton();
        allProductsPage.ClickLogOut();
    }
}
