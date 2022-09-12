package utilities;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InnovaTestBase {

    protected WebDriver driver;
    AllPages allPages = new AllPages();

    @Parameters("browser")

    @BeforeClass
    public void setup(@Optional String browser) throws Exception {
        driver = Driver.getDriver(browser);
        driver.get(ConfigurationReader.getProperty("InnovaQa_url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        allPages.loginPage().login();
        BrowserUtils.waitFor(2);
        driver.manage().deleteAllCookies();
    }
//    @AfterMethod
//    public void takeScreenshot(ITestResult result){
//        TakesScreenshot camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        try{
//            Files.move(screenshot, new File ("C:\\Users\\Michael\\Documents\\Innova\\src\\main\\resources/screenshots"+ result.getName() + ".png"));
//        }catch(IOException e){
//            e.printStackTrace();
//        }


    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        Driver.closeDriver();
    }
}

