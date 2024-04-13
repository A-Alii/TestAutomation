package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class SignUpPage extends TestBase {

    public SignUpPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signup_login;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement NameInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement EmailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement SignUpButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    WebElement EnterIsVisible;

    @FindBy(id = "id_gender1")
    WebElement TitleCheckBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement PasswordFieldSendKeys;

    @FindBy(id = "days")
    private WebElement dayDropdown;

    @FindBy(id = "months")
    private WebElement monthDropdown;

    @FindBy(id = "years")
    private WebElement yearDropdown;

    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    WebElement NewsletterCheckBox;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    WebElement ReceiveCheckBox;


    @FindBy(xpath = "//*[@id=\"first_name\"]")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    WebElement LastName;

    //*[@id="company"]
    @FindBy(xpath = "//*[@id=\"company\"]")
    WebElement Company;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    WebElement Address1;

    @FindBy(xpath = "//*[@id=\"address2\"]")
    WebElement Address2;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement CountryDropDown;

    @FindBy(xpath = "//*[@id=\"state\"]")
    WebElement State;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement City;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    WebElement ZipCode;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    WebElement MobileNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    WebElement CreateAccountButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement LogOut;


    public void clicksignup_login() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(signup_login));
        //js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", signup_login);
    }

    public void sendKeys_name(String name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NameInput));
        //js.executeScript("arguments[0].scrollIntoView(true);", NameInput);
        NameInput.sendKeys(name);
    }

    public void sendKeys_email(String email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(EmailInput));
        //js.executeScript("arguments[0].scrollIntoView(true);", EmailInput);
        EmailInput.sendKeys(email);
    }

    public void sendKeys_Password(String password) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(PasswordFieldSendKeys));
        //js.executeScript("arguments[0].scrollIntoView(true);", PasswordFieldSendKeys);
        PasswordFieldSendKeys.sendKeys(password);
    }

    public void ClickSignUpButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SignUpButton));
        js.executeScript("arguments[0].scrollIntoView(true);", SignUpButton);
        js.executeScript("arguments[0].click()", SignUpButton);
    }

    public void TitleCheckBoxClick() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(TitleCheckBox));
        js.executeScript("arguments[0].scrollIntoView(true);", TitleCheckBox);
        js.executeScript("arguments[0].click()", TitleCheckBox);
    }

    public void BirthDate(String day, String month, String year) throws InterruptedException{
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByVisibleText(day);

        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);

        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText(year);
    }

    public void NewsLetterCheckBox() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NewsletterCheckBox));
        //js.executeScript("arguments[0].scrollIntoView(true);", NewsletterCheckBox);
        js.executeScript("arguments[0].click()", NewsletterCheckBox);
    }

    public void ReceiveOfferCheckBox() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ReceiveCheckBox));
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiveCheckBox);
        js.executeScript("arguments[0].click()", ReceiveCheckBox);
    }

    public void sendKeys_FName(String FName) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(FirstName));
        js.executeScript("arguments[0].scrollIntoView(true);", FirstName);
        FirstName.sendKeys(FName);
    }
    public void sendKeys_LName(String LName) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LastName));
        js.executeScript("arguments[0].scrollIntoView(true);", LastName);
        LastName.sendKeys(LName);
    }
    public void sendKeys_Company(String comp) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Company));
        js.executeScript("arguments[0].scrollIntoView(true);", Company);
        Company.sendKeys(comp);
    }

    public void sendKeys_Address1(String address) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Address1));
        //js.executeScript("arguments[0].scrollIntoView(true);", Address1);
        Address1.sendKeys(address);
    }

    public void sendKeys_Address2(String address2) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Address2));
        //js.executeScript("arguments[0].scrollIntoView(true);", Address2);
        Address2.sendKeys(address2);
    }

    public void CountryDropDown(String country) throws InterruptedException{
        Select countrySelect = new Select(CountryDropDown);
        countrySelect.selectByVisibleText(country);
    }

    public void sendKeys_State(String state) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(State));
        js.executeScript("arguments[0].scrollIntoView(true);", State);
        State.sendKeys(state);
    }

    public void sendKeys_City(String city) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(City));
        js.executeScript("arguments[0].scrollIntoView(true);", City);
        City.sendKeys(city);
    }

    public void sendKeys_ZipCode(String zipcode) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ZipCode));
        //js.executeScript("arguments[0].scrollIntoView(true);", ZipCode);
        ZipCode.sendKeys(zipcode);
    }

    public void sendKeys_MobileNumber(String mobile) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(MobileNumber));
        //js.executeScript("arguments[0].scrollIntoView(true);", MobileNumber);
        MobileNumber.sendKeys(mobile);
    }

    public void ClickCreateAccountButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(CreateAccountButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", CreateAccountButton);
        js.executeScript("arguments[0].click()", CreateAccountButton);
    }



    public boolean EnterAccountIsExist(){
        return EnterIsVisible.isDisplayed();
    }

    public String EnterAccountTitle(){
        return EnterIsVisible.getText();
    }


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement AccountCreatedVisible;

    public boolean AccountCreatedVisibleExist(){
        return AccountCreatedVisible.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ContinueButton;

    public void ClickContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", ContinueButton);
        js.executeScript("arguments[0].click()", ContinueButton);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement DeleteAccount;

    public void ClickDeleteAcount() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(DeleteAccount));
        //js.executeScript("arguments[0].scrollIntoView(true);", DeleteAccount);
        js.executeScript("arguments[0].click()", DeleteAccount);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement DeleteAccountContinueButton;

    public void ClickDeleteAccountContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(DeleteAccountContinueButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", DeleteAccountContinueButton);
        js.executeScript("arguments[0].click()", DeleteAccountContinueButton);
    }

    public void ClickLogOutAccountContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LogOut));
        //js.executeScript("arguments[0].scrollIntoView(true);", LogOut);
        js.executeScript("arguments[0].click()", LogOut);
    }

}
