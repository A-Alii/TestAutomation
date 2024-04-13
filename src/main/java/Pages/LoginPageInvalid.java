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

public class LoginPageInvalid extends TestBase {

    public LoginPageInvalid() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signup_login;

    public void clicksignup_login() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(signup_login));
        //js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", signup_login);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement LoginEmailAddress;

    public void LoginEmailAddressSendKeys_name(String Email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginEmailAddress));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginEmailAddress);
        LoginEmailAddress.sendKeys(Email);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement LoginPassword;

    public void LoginPasswordSendKeys_name(String Password) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginPassword));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginPassword);
        LoginPassword.sendKeys(Password);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement LoginButton;

    public void clickOnLoginButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginButton);
        js.executeScript("arguments[0].click()", LoginButton);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    WebElement ErrorLogin;
    public boolean errorLoginInvalid(){
        return ErrorLogin.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    WebElement ErrorLoginWord;
    public String errorLoginInvalidWord() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        return ErrorLoginWord.getText();
    }

}