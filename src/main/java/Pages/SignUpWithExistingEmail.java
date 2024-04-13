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

public class SignUpWithExistingEmail extends TestBase {
    public SignUpWithExistingEmail() throws IOException {
        PageFactory.initElements(driver,this);
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

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
    WebElement ErrorIsVisible;





    public void clicksignup_login() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(signup_login));
        //js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", signup_login);
    }

    public void sendKeys_name(String name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NameInput));
        NameInput.sendKeys(name);
    }

    public void sendKeys_email(String email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(EmailInput));
        EmailInput.sendKeys(email);
    }

    public void ClickSignUpButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SignUpButton));
        js.executeScript("arguments[0].click()", SignUpButton);
    }
    public boolean EnterAccountIsExist(){
        return ErrorIsVisible.isDisplayed();
    }

    public String ErrorWord() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SignUpButton));
        return ErrorIsVisible.getText();
    }

}
