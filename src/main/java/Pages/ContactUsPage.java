package Pages;

import Base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ContactUsPage extends TestBase {
    public ContactUsPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
    WebElement ContactUsButton;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[1]/input")
    WebElement NameField;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[2]/input")
    WebElement EmailField;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[3]/input")
    WebElement SubjectField;
    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement MessageField;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[5]/input")
    WebElement FileField;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[6]/input")
    WebElement SubmitButton;
    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    WebElement SuccessWord;
    @FindBy(xpath = "//*[@id=\"form-section\"]/a")
    WebElement HomeButton;

    public void clickContactUsButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ContactUsButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", ContactUsButton);
    }
    public void SendKeys_Name(String Name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NameField));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginEmailAddress);
        NameField.sendKeys(Name);
    }
    public void SendKeys_Email(String Email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(EmailField));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginEmailAddress);
        EmailField.sendKeys(Email);
    }
    public void SendKeys_Subject(String Subject) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SubjectField));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginEmailAddress);
        SubjectField.sendKeys(Subject);
    }
    public void SendKeys_Message(String Message) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(MessageField));
        //js.executeScript("arguments[0].scrollIntoView(true);", LoginEmailAddress);
        MessageField.sendKeys(Message);
    }
    public void SendKeys_Upload(String File) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(FileField));
        js.executeScript("arguments[0].scrollIntoView(true);", FileField);
        FileField.sendKeys(File);
    }
    public void clickSubmitButton() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(SubmitButton));
        js.executeScript("arguments[0].scrollIntoView(true);",SubmitButton);
        js.executeScript("arguments[0].click()", SubmitButton);
    }
    public void okButtonClick() throws IOException{
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String SuccessWord(){
        return SuccessWord.getText();
    }
    public void clickHomeButton() throws IOException{
        wait.until(ExpectedConditions.visibilityOf(HomeButton));
        js.executeScript("arguments[0].scrollIntoView(true);",HomeButton);
        js.executeScript("arguments[0].click()", HomeButton);
    }
}
