package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.Driver;

import javax.sql.rowset.BaseRowSet;
import java.util.Set;

import static utilities.Driver.driver;

public class AuctionItemPage extends BasePage {
    SoftAssert assertion = new SoftAssert();
    AllPages allPages = new AllPages();

    public AuctionItemPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Item Page
    @FindBy(css = ".btn.btn-secondary.btn-white")
    public WebElement acceptCookies;
    @FindBy(css = ".d-lg-block.d-none.row > .col-12 > h1")
    public WebElement itemVerification;
    @FindBy(id = "loadOut")
    public WebElement loadOutCollapseIcon;
    @FindBy(xpath = "(//div[@class='row'])[9]")
    public WebElement jumpStartValidation;
    @FindBy(xpath = "(//div[@class='row'])[10]")
    public WebElement loadingDocValidation;
    @FindBy(xpath = "(//div[@class='row'])[11]")
    public WebElement forkliftValidation;
    @FindBy(xpath = "(//div[@class='row'])[12]")
    public WebElement siteRestrictionsValidation;
    @FindBy(xpath = "(//div[@class='row'])[13]")
    public WebElement specialInstructionsValidation;
    @FindBy(xpath = "(//div[@class='row'])[14]")
    public WebElement noticeRequiredToView;
    @FindBy(xpath = "(//div[@class='row'])[15]")
    public WebElement loadOutAssistanceValidation;


    //**************************************************** Methods Below ***********************************************
    public String itemVerificationOnAuctionPage() {
        return itemVerification.getText();
    }
    public String jumpstartValidation(){
        return jumpStartValidation.getText();
    }
    public String loadingDockValidation(){
        return loadingDocValidation.getText();
    }
    public String forkliftValidation(){
        return forkliftValidation.getText();
    }
    public String siteRestrictionsValidation(){
        return siteRestrictionsValidation.getText();
    }
    public String specialInstructionsValidation(){
        return specialInstructionsValidation.getText();
    }
    public String noticeRequiredToViewValidation(){
        return noticeRequiredToView.getText();
    }
    public String loadOutAssistanceValidation(){
        return loadOutAssistanceValidation.getText();
    }
    public void loadOutInstructionsValidation(){
        gearIcon.click();
        allPages.packagesPage().viewListingTab.click();
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        Set<String> handles = driver.getWindowHandles();
        String firstWindowHandle = driver.getWindowHandle();
        System.out.println(firstWindowHandle);
        handles.remove(firstWindowHandle);
        String secondWindowHandle = handles.iterator().next();
        driver.switchTo().window(secondWindowHandle);
        BrowserUtils.waitFor(2);
        System.out.println(secondWindowHandle);
        BrowserUtils.waitFor(2);
        //allPages.auctionItemPage().acceptCookies.click();
        BrowserUtils.waitFor(2);
        loadOutCollapseIcon.click();
        BrowserUtils.waitFor(2);
        assertion.assertTrue(jumpstartValidation().contains("Jump start available: Yes"));
        assertion.assertTrue(loadingDockValidation().contains("Loading Dock: Yes"));
        assertion.assertTrue(forkliftValidation().contains("Forklift: Yes, 5000 pounds"));
        assertion.assertTrue(siteRestrictionsValidation().contains("Site Restrictions (PPE): Yes, This if for site restrictions details"));
        assertion.assertTrue(specialInstructionsValidation().contains("Special Instructions: Yes, All This instructions info"));
        assertion.assertTrue(noticeRequiredToViewValidation().contains("Yes"));
        assertion.assertTrue(loadOutAssistanceValidation().contains("Yes, This is used if any load out assist is needed"));
        BrowserUtils.waitFor(1);
        handles.remove(secondWindowHandle);
        driver.close();
        BrowserUtils.waitFor(2);
        driver.switchTo().window(firstWindowHandle);
    }
}
