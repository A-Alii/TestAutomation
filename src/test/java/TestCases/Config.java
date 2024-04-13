package TestCases;

import Base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Config extends TestBase {
    public Config() throws IOException {
        super();
    }
    /*@BeforeSuite
    public void beforeSuite() throws IOException{
        initialization();
        extent = new ExtentReports("D:\\testing courses\\automation for web\\Test-auto\\src\\Test Report\\report.html", true);
        extent.addSystemInfo("OS", "Windows");
        extent.addSystemInfo("Owner", "Ahmed Ali");
        extent.addSystemInfo("Test Name", "Automation");
        extent.addSystemInfo("Language", "Java");
    }

    @AfterSuite
    public void afterSuite() throws IOException {
        extent.flush();
        tearDown();
    }*/
}
