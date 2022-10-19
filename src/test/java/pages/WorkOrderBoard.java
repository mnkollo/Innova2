package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.Driver;

public class WorkOrderBoard extends BasePage {

    SoftAssert assertion = new SoftAssert();

    public WorkOrderBoard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Offer Work Order
    @FindBy(css = ".form-control.input-xs.is-invalid.undefined")
    public WebElement destinationLocation;
    @FindBy(css = "[class] [class$='12']:nth-of-type(2) [type]")
    public WebElement negotiatedTransactionFee;
    @FindBy(xpath = "//option[contains(text(),'Primary')]")
    public WebElement primaryLocationDropdown;

    // Pending Section
    @FindBy(xpath = "(//span[contains(text(),'Payment Request')])[1]")
    public WebElement pendingCard;

    @FindBy(xpath = "(//div[contains(text(),'Offer')])[1]")
    public WebElement offerCard;

    @FindBy(xpath = "(//p[@class='card-text'])[1]")
    public WebElement offerCardVerification;
    @FindBy(xpath = "(//div[@class='d-flex flex-row justify-content-between align-content-center mb-2 col-12'])[3]")
    public WebElement getTransactionFee;

    //Payment Request Section
    @FindBy(css = "h5#notes > .fa.fa-lg.fa-plus")
    public WebElement notesAccordion;
    @FindBy(css = ".card > .collapse.show")
    public WebElement textVerification;

    @FindBy(css = "h3 > span")
    public WebElement paymentRequestPageVerification;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement datePickerTextBox;
    @FindBy(css = "[role] .react-datepicker__week:nth-of-type(2) [aria-label='day-4']")
    public WebElement selectTodayDate;
    @FindBy(xpath = "//input[@class='form-control input-xs form-control']")
    public WebElement referenceNumber;
    @FindBy(xpath = "//select[@class='form-control input-xs form-control']")
    public WebElement bankAccountDropdown;

    //Action Menu
    @FindBy(xpath = "//a[contains(text(),'Schedule')]")
    public WebElement scheduleTab;
    @FindBy(xpath = "//a[contains(text(),'Complete')]")
    public WebElement completeTab;
    @FindBy(xpath = "//a[contains(text(),'Accept Offer')]")
    public WebElement acceptOfferTab;

    public void createdPaymentRequest() {
        workOrderBoard.click();
        BrowserUtils.waitFor(5);
        pendingCard.click();
        gearIcon.click();
        addNoteTab.click();
        addNoteTextBox.sendKeys(sInstructions);
        saveButton.click();
        BrowserUtils.waitFor(1);
        notesAccordion.click();
        assertion.assertTrue(notesTextVerification().contains(sInstructions));
        gearIcon.click();
        scheduleTab.click();
        yesButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(paymentRequestTitleVerification().contains("Scheduled"));
        BrowserUtils.waitFor(1);
        BrowserUtils.dropdownVisible(bankAccountDropdown,"FNB Stanton 089");
        BrowserUtils.waitFor(1);
        datePickerTextBox.click();
        BrowserUtils.waitFor(1);
        selectTodayDate.click();
        referenceNumber.sendKeys(rNumber);
        gearIcon.click();
        completeTab.click();
        yesButton.click();
        assertion.assertTrue(paymentRequestTitleVerification().contains("Complete"));
    }

    public String notesTextVerification() {
        return textVerification.getText();
    }
    public String offerCardVerification() {
        return offerCardVerification.getText();
    }
    public String getTransactionFee(){
        return getTransactionFee.getText();
    }

    public String paymentRequestTitleVerification() {
        return paymentRequestPageVerification.getText();
    }
    public void offerDisplaysOnWorkOrderBoard(){
        workOrderBoard.click();
        BrowserUtils.waitFor(5);
        assertion.assertTrue(offerCardVerification().contains("2016 BMW 328I"));
        assertion.assertTrue(offerCardVerification().contains("Retail Price: $500.00"));
        assertion.assertTrue(offerCardVerification().contains("Seller: $600.00"));
        assertion.assertTrue(offerCardVerification().contains(companyName));
    }
    public void acceptOfferFromWorkOrderBoard(){
        workOrderBoard.click();
        offerCardVerification.click();
        BrowserUtils.waitFor(2);
        destinationLocation.click();
        primaryLocationDropdown.click();
        //BrowserUtils.dropdownValue(destinationLocation,"6472");
        negotiatedTransactionFee.sendKeys(Keys.BACK_SPACE);
        negotiatedTransactionFee.sendKeys("50");
        BrowserUtils.waitFor(1);
        assertion.assertTrue(getTransactionFee().contains("Sub-Total Transaction Fee: $650.00"));
        gearIcon.click();
        acceptOfferTab.click();
        yesButton.click();
        BrowserUtils.waitFor(1);


    }
}
