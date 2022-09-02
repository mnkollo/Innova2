package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.Driver;

public class PackagesPage extends BasePage {

    SoftAssert assertion = new SoftAssert();
    public PackagesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Create Package - Modal
    @FindBy(name = "description")
    public WebElement descriptionTextBox;
    @FindBy(name = "auctionType_ID")
    public WebElement typeDropdown;
    @FindBy(name = "saleFormat_ID")
    public WebElement saleFormatDropdown;

    //Packages Page
    @FindBy(css = "h4#options")
    public WebElement packageValidation;
    @FindBy(css = ".col-12.col-padding-right.col-sm-6")
    public WebElement packageCardValidation;

    @FindBy(css = "div#equipmentCollapse  .table-responsive")
    public WebElement itemsSection;

    //Action Menu
    @FindBy(xpath = "(//a[contains(text(),'Add Item')])[1]")
    public WebElement addItemTab;

    //Create Package Item - Modal
    @FindBy(css = ".modal-body [class^='col'] .react-select__value-container")
    public WebElement yearDropdown;
    @FindBy(xpath = "//div[contains(text(),'2016')]")
    public WebElement year2016;
    @FindBy(css = ".modal-body [class^='uppercase']:nth-of-type(2) .react-select__value-container")
    public WebElement makeDropdown;
    @FindBy(xpath = "//div[contains(text(),'BMW')]")
    public WebElement makeBMW;
    @FindBy(css = ".modal-body [class^='uppercase']:nth-of-type(3) .react-select__value-container")
    public WebElement modelDropdown;
    @FindBy(xpath = "//div[contains(text(),'328I')]")
    public WebElement modelThreeTwentyEightI;
    @FindBy(name = "details")
    public WebElement detailsTextBox;
    @FindBy(name = "additionalDetails")
    public WebElement additionalDetailsTextBox;
    @FindBy(name = "disclaimer")
    public WebElement disclaimerTextBox;
    @FindBy(id = "estimatedValue")
    public WebElement estimatedValueTextBox;
    @FindBy(xpath = "//div[contains(text(),'Primary')]")
    public WebElement primaryLocation;
    @FindBy(css = "[class^='input-xs no-padding r'] .react-select__value-container")
    public WebElement locationDropdown;

    @FindBy(id = "vin")
    public WebElement serialNumber;
    @FindBy(xpath = "//button[contains(text(),'Decode')]")
    public WebElement decodeButton;

    @FindBy(css = ".modal-body [class^='col-12 col-x']:nth-of-type(1) .react-select__value-container")
    public WebElement categoryDropdown;
    @FindBy(xpath = "//div[contains(text(),'Vehicles')]")
    public WebElement vehiclesCategory;
    @FindBy(css = ".modal-body [class='col-12 col-xl-4']:nth-of-type(2) .react-select__value-container")
    public WebElement categoryFamilyDropdown;
    @FindBy(xpath = "//div[contains(text(),'Automobile')]")
    public WebElement automobilesCategoryFamily;








    //-------------------------------------------------------------------------------------------------------------------
    public void createAConsignmentPackage(){
        allPages.accountsPage().navigateToActionMenuFromNormalView();
        gearIcon.click();
        allPages.accountsPage().clickCreatePackage();
        descriptionTextBox.sendKeys(packageName + " Package");
        BrowserUtils.dropdownVisible(typeDropdown,"Consignment");
        BrowserUtils.dropdownVisible(saleFormatDropdown,"Cascade");
        saveButton.click();
        BrowserUtils.waitFor(2);
        assertion.assertTrue(packageNameValidation().contains(packageName));
        assertion.assertTrue(packageCardValidation().contains("Consignment"));
        assertion.assertTrue(packageCardValidation().contains("Cascade"));
        assertion.assertAll();
    }
    public String packageNameValidation(){
        return packageValidation.getText();
    }
    public String packageCardValidation(){
        return packageCardValidation.getText();
    }
    public void AddItemToAPackageWithRequiredFields(){
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addItemTab.click();
        yearDropdown.click();
        year2016.click();
        makeDropdown.click();
        makeBMW.click();
        modelDropdown.click();
        modelThreeTwentyEightI.click();
        BrowserUtils.waitFor(2);
        detailsTextBox.sendKeys(textInDetails);
        additionalDetailsTextBox.sendKeys(textAdditionalDetails);
        disclaimerTextBox.sendKeys(disclaimer);
        locationDropdown.click();
        primaryLocation.click();
        estimatedValueTextBox.sendKeys(estimatedValue);
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemsValidation().contains(descriptionOfItem1));
        assertion.assertTrue(itemsValidation().contains(estimatedValue));
    }
    public void VIN_DecodeWhenAddingItemToAPackage() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addItemTab.click();
        serialNumber.sendKeys(vinNumber);
        decodeButton.click();
        BrowserUtils.waitFor(1);
        categoryDropdown.click();
        vehiclesCategory.click();
        categoryFamilyDropdown.click();
        BrowserUtils.waitFor(1);
        automobilesCategoryFamily.click();
        BrowserUtils.waitFor(2);
        detailsTextBox.sendKeys(textInDetails2);
        additionalDetailsTextBox.sendKeys(textAdditionalDetails2);
        disclaimerTextBox.sendKeys(disclaimer);
        locationDropdown.click();
        primaryLocation.click();
        estimatedValueTextBox.sendKeys(estimatedValue2);
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemsValidation().contains(descriptionOfItem2));
        assertion.assertTrue(itemsValidation().contains(estimatedValue2));
    }
    public void searchForPackage(){
        packagesTab.click();
        searchField.sendKeys(packageName);
        searchButton.click();
        createdAccount.click();
    }
    public String itemsValidation(){
        return itemsSection.getText();
    }
}


