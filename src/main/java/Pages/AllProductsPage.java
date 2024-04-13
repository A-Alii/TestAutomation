package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class AllProductsPage extends TestBase {
    public AllProductsPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement HomeWord;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement ProductButton;
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/h2")
    WebElement AllProductsWord;
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
    WebElement ViewProduct;
    @FindBy(xpath = "//*[@id=\"search_product\"]")
    WebElement SearchBar;
    @FindBy(xpath = "//*[@id=\"submit_search\"]")
    WebElement SearchButton ;
    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement Quantity;
    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    WebElement AddToCart ;
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")
    WebElement ViewCart ;
    @FindBy(xpath = "//*[@id=\"product-1\"]/td[2]/h4/a")
    WebElement ProductName ;
    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    WebElement ProcessedToCheckOut ;
    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a")
    WebElement Register_Login ;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement LoginEmailAddress;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement LoginPassword;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement LoginButton;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement CartLink;
    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
    WebElement PlaceOrder;
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[1]/div/input")
    WebElement CardName;
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[2]/div/input")
    WebElement CardNumber;
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/input")
    WebElement Cvc;
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/input")
    WebElement Expiration;
    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
    WebElement Year;
    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement SubmitButton;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ContinueButton;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement LogOut;
    public String Words(){
        return HomeWord.getText();
    }
    public void ClickOnProductButton() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(ProductButton));
        js.executeScript("arguments[0].click()", ProductButton);
    }
    public boolean AllProductsVisible(){
        return AllProductsWord.isDisplayed();
    }
    public void ClickOnViewProduct() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(ViewProduct));
        js.executeScript("arguments[0].scrollIntoView(true);", ViewProduct);
        js.executeScript("arguments[0].click()", ViewProduct);
    }
    public void SendKeys_Search(String Name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SearchBar));
        js.executeScript("arguments[0].scrollIntoView(true);", SearchBar);
        SearchBar.sendKeys(Name);
    }
    public void ClickOnSearch() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(SearchButton));
        js.executeScript("arguments[0].click()", SearchButton);
    }
    public void SendKeys_Quantity(String num) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Quantity));
       // js.executeScript("arguments[0].scrollIntoView(true);", Quantity);
        int quantity = Integer.parseInt(num);
        SearchBar.sendKeys(String.valueOf(quantity));
    }
    public void ClickOnAddToCart() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(AddToCart));
        js.executeScript("arguments[0].click()", AddToCart);
    }
    public void ClickOnViewCart() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(ViewCart));
        js.executeScript("arguments[0].scrollIntoView(true);", ViewCart);
        js.executeScript("arguments[0].click()", ViewCart);
    }
    public String ProductNameWord(){
        return ProductName.getText();
    }
    public void ClickOnProcessedToCheckOut() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(ProcessedToCheckOut));
        js.executeScript("arguments[0].click()", ProcessedToCheckOut);
    }
    public void ClickOnRegister_Login() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(Register_Login));
        js.executeScript("arguments[0].click()", Register_Login);
    }
    public void LoginEmailAddressSendKeys_name(String Email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginEmailAddress));
        LoginEmailAddress.sendKeys(Email);
    }
    public void LoginPasswordSendKeys_name(String Password) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginPassword));
        LoginPassword.sendKeys(Password);
    }
    public void clickOnLoginButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        js.executeScript("arguments[0].click()", LoginButton);
    }
    public void clickOnCart() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(CartLink));
        js.executeScript("arguments[0].click()", CartLink);
    }
    public void clickOnPlaceOrderButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(PlaceOrder));
        js.executeScript("arguments[0].scrollIntoView(true);", PlaceOrder);
        js.executeScript("arguments[0].click()", PlaceOrder);
    }
    public void SendKeys_CardName(String Name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(CardName));
        CardName.sendKeys(Name);
    }
    public void SendKeys_CardNumber(String Number) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(CardNumber));
        js.executeScript("arguments[0].scrollIntoView(true);", CardNumber);
        CardNumber.sendKeys(Number);
    }
    public void SendKeys_CardCvc(String Cvcc) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Cvc));
        js.executeScript("arguments[0].scrollIntoView(true);", Cvc);
        Cvc.sendKeys(Cvcc);
    }
    public void SendKeys_Expiration(String exp) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Expiration));
        Expiration.sendKeys(exp);
    }
    public void SendKeys_Year(String yearr) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Year));
        Year.sendKeys(yearr);
    }
    public void clickOnSubmitButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SubmitButton));
        js.executeScript("arguments[0].click()", SubmitButton);
    }
    public void clickOnContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        js.executeScript("arguments[0].click()", ContinueButton);
    }
    public void ClickLogOut() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LogOut));
        js.executeScript("arguments[0].click()", LogOut);
    }
}
