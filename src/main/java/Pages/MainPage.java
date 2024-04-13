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

public class MainPage extends TestBase {


    public MainPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signup_login;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    WebElement wordNewUserSignUp;




    public void clicksignup_login() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(signup_login));
        js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", signup_login);
    }

    public boolean wordExist(){
        return wordNewUserSignUp.isDisplayed();
    }

    /*@FindBy(xpath = "//*[@id=\"nav-logo-sprites\"]")
    WebElement logo;

    @FindBy(id = "nav-link-accountList")
    WebElement login;


    @FindBy(id = "continue")
    WebElement word;

    @FindBy(id = "nav-hamburger-menu")
    WebElement navbar;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/ul/li[4]/a")
    WebElement autorsection;


    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[9]/li[10]/a")
    WebElement autor;


    @FindBy(xpath = "//*[@id=\"a-page\"]/div[1]/div[2]/div[1]/div/div/h1/b")
    WebElement autorw;




    public void clickLogo() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(logo));
        js.executeScript("arguments[0].scrollIntoView(true);", logo);
        js.executeScript("arguments[0].click()", logo);
    }

    public void clicklink () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(login));
        js.executeScript("arguments[0].scrollIntoView(true);", login);
        js.executeScript("arguments[0].click()", login);
    }


    public boolean wordExist(){
        return word.isDisplayed();
    }

    public void getAutor(){
        wait.until(ExpectedConditions.visibilityOf(login));
        js.executeScript("arguments[0].scrollIntoView(true);", navbar);
        js.executeScript("arguments[0].click()", navbar);
        wait.until(ExpectedConditions.visibilityOf(login));
        js.executeScript("arguments[0].scrollIntoView(true);", autorsection);
        js.executeScript("arguments[0].click()", autorsection);
        wait.until(ExpectedConditions.visibilityOf(login));
        js.executeScript("arguments[0].scrollIntoView(true);", autor);
        js.executeScript("arguments[0].click()", autor);
        wait.until(ExpectedConditions.visibilityOf(login));
    }*/

    /*public boolean wordE(){
        return autorw.isDisplayed();
    }*/



}
