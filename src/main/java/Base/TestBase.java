package Base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

//Define our driver here and all test cases will extend this class
public class TestBase {
    protected static WebDriver driver;
    public TestBase() throws IOException {
    }

    public static void initialization(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");
        String title = driver.getTitle();
        System.out.println(title);

    }
    public static void tearDown() throws IOException {
        driver.quit();
    }
}
