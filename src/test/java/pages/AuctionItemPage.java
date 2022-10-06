package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class AuctionItemPage {
    SoftAssert assertion = new SoftAssert();

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
    public String itemVerification() {
        return itemVerification.getText();
    }
}
