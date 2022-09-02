package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class WorkOrderBoard extends BasePage {

    SoftAssert assertion = new SoftAssert();

    public WorkOrderBoard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Pending Section
    @FindBy(css = "[class^='lanes']:nth-of-type(2) .card:nth-child(2) .card-text")
    public WebElement pendingCard;

    //Add Work Order Note - Modal
    @FindBy(name = "text")
    public WebElement notesTextBox;

    //Payment Request Section
    @FindBy(css = "h5#notes > .fa.fa-lg.fa-plus")
    public WebElement notesAccordion;
    @FindBy(css = ".card > .collapse.show")
    public WebElement textVerification;

    //Action Menu
    @FindBy(xpath = "//a[contains(text(),'Schedule')]")
    public WebElement scheduleTab;

    public void createdPaymentRequest(){
        workOrderBoard.click();
        pendingCard.click();
        gearIcon.click();
        addNoteTab.click();
        addNoteTextBox.sendKeys(sInstructions);
        saveButton.click();
        notesAccordion.click();
        assertion.assertTrue(notesTextVerification().contains(sInstructions));
        gearIcon.click();
        scheduleTab.click();
        yesButton.click();

    }
    public String notesTextVerification(){
        return textVerification.getText();
    }
}
