package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.BrowserUtils;
import utilities.Driver;
import java.awt.*;
import java.io.IOException;
import static utilities.Driver.driver;

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

    //Packages Validation
    @FindBy(css = "h4#options")
    public WebElement packageValidation;
    @FindBy(css = ".col-12.col-padding-right.col-sm-6")
    public WebElement packageCardValidation;

    @FindBy(css = ".row:nth-of-type(5) [data-tip] td:nth-of-type(1)")
    public WebElement lienHolderValidation;

    @FindBy(css = ".col-12.col-md-12.col-sm-12 > .card > .collapse.show .table-responsive")
    public WebElement valueServicesValidation;

    //Add Items and Add items through file
    @FindBy(xpath = "//button[contains(text(),'Import All Items')]")
    public WebElement importAllItemsButton;
    @FindBy(css = ".close > span")
    public WebElement xIconOnImportItemsProgressPage;

    @FindBy(css = "div#equipmentCollapse  .table-responsive")
    public WebElement itemsSection;
    //Audits - Section
    @FindBy(xpath = "(//a[contains(text(),'Add Item')])[1]")
    public WebElement addItemTab;
    @FindBy(xpath = "//a[contains(text(),'Add Items from File')]")
    public WebElement addItemsFromAFileTab;


    //Add Value Services - Modal
    @FindBy(name = "blueChip_ID")
    public WebElement serviceDropdown;
    @FindBy(id = "quantity")
    public WebElement quantityTextBox;
    @FindBy(id = "markup")
    public WebElement markupTextBox;
    @FindBy(id = "cost")
    public WebElement costTextBox;
    @FindBy(id = "price")
    public WebElement priceBox;
    @FindBy(css = "[data-tip] td:nth-of-type(1)")
    public WebElement valueServiceEdit;
    @FindBy(css = ".fa.fa-trash.pointer")
    public WebElement valueServicesTrashIcon;

    // Accordions On Package Page

    @FindBy(css = "h5#excludedItems > .fa.fa-lg.fa-plus")
    public WebElement excludedItemsAccordion;

    @FindBy(css = "h5#Audits > .fa.fa-lg.fa-plus")
    public WebElement auditAccordion;

    @FindBy(css = "h5#blue-chip-services > .fa.fa-lg.fa-plus")
    public WebElement valueServicesAccordion;
    @FindBy(css = "h5#blue-chip-services > .fa.fa-lg.fa-plus")
    public WebElement lienHolderAccordion;


    //Items Section
    @FindBy(css = "a:nth-of-type(1) > .pl-4.vertical-align-middle > input[type='checkbox']")
    public WebElement firstItemInItemSection;

    @FindBy(css = ".border-gray.items-table.table.table-header-primary.table-sm")
    public WebElement itemsValidation;

    //Audit Section

    @FindBy(css = ".col-12 > .card > .collapse.show  .table-responsive")
    public WebElement auditVerification;

    //Exclude Section

    @FindBy(css = "[class] .card:nth-of-type(2) table")
    public WebElement excludedItemsValidation;
    @FindBy(css = ".a-table.strike > .pl-4.vertical-align-middle > input[type='checkbox']")
    public WebElement includeButtonFirstItem;


    //Action Menu
    @FindBy(xpath = "//a[contains(text(),'Add Value Service')]")
    public WebElement addValueServiceTab;

    @FindBy(xpath = "//a[contains(text(),'Add Note')]")
    public WebElement addNoteTabOnPackagePage;
    @FindBy(xpath = "//a[contains(text(),'Add Lien Holder')]")
    public WebElement addLienHolderTab;

    //Add Lien Holder - Modal
    @FindBy(name = "lienholder_ID")
    public WebElement lienHolderDropdown;
    @FindBy(name = "contact_ID")
    public WebElement contactDropdown;

    //Create Package Item - Modal
    @FindBy(css = ".modal-body [class^='col'] .react-select__value-container")
    public WebElement yearDropdown;
    @FindBy(xpath = "//div[contains(text(),'2016')]")
    public WebElement year2016;
    @FindBy(xpath = "//div[contains(text(),'2014')]")
    public WebElement year2014;
    @FindBy(css = ".modal-body [class^='uppercase']:nth-of-type(2) .react-select__value-container")
    public WebElement makeDropdown;
    @FindBy(xpath = "//div[contains(text(),'BMW')]")
    public WebElement makeBMW;
    @FindBy(css = ".modal-body [class^='uppercase']:nth-of-type(3) .react-select__value-container")
    public WebElement modelDropdown;
    @FindBy(xpath = "//div[contains(text(),'328I')]")
    public WebElement modelThreeTwentyEightI;
    @FindBy(xpath = "//div[contains(text(),'330E')]")
    public WebElement modelThreeThirtyE;
    @FindBy(id = "horsePower")
    public WebElement horsePowerTextBox;
    @FindBy(name = "details")
    public WebElement detailsTextBox;
    @FindBy(name = "additionalDetails")
    public WebElement additionalDetailsTextBox;
    @FindBy(name = "disclaimer")
    public WebElement disclaimerTextBox;
    @FindBy(id = "estimatedValue")
    public WebElement estimatedValueTextBox;
    @FindBy(css = ".modal-body [class^='col-12 col-md-6']:nth-of-type(1) .react-select__value-container--has-value")
    public WebElement meterTypeDropdown;
    @FindBy(xpath = "//div[contains(text(),'Kilometers')]")
    public WebElement kilometersDropdown;
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
    @FindBy(xpath = "(//div[contains(text(),'Vehicles')])[2]")
    public WebElement vehiclesCategory;
    @FindBy(css = ".modal-body [class='col-12 col-xl-4']:nth-of-type(2) .react-select__value-container")
    public WebElement categoryFamilyDropdown;
    @FindBy(xpath = "//div[contains(text(),'Automobile')]")
    public WebElement automobilesCategoryFamily;
    @FindBy(id = "atStockNumber")
    public WebElement stockNumberTextBox;
    @FindBy(id = "assetNumber")
    public WebElement assetTextBox;


    //-------------------------------------------------------------------------------------------------------------------
    public void createAConsignmentPackage() {
        allPages.accountsPage().navigateToActionMenuFromNormalView();
        gearIcon.click();
        allPages.accountsPage().clickCreatePackage();
        descriptionTextBox.sendKeys(packageName + " Package");
        BrowserUtils.dropdownVisible(typeDropdown, "Consignment");
        BrowserUtils.dropdownVisible(saleFormatDropdown, "Cascade");
        saveButton.click();
        BrowserUtils.waitFor(3);
        assertion.assertTrue(packageNameValidation().contains(packageName + " Package"));
        assertion.assertTrue(packageCardValidation().contains("Consignment"));
        assertion.assertTrue(packageCardValidation().contains("Cascade"));
        assertion.assertAll();
    }

    public String packageNameValidation() {
        return packageValidation.getText();
    }

    public String excludedItemValidation() {
        return excludedItemsValidation.getText();
    }

    public String itemInPackageValidation() {
        return itemsValidation.getText();
    }

    public String packageCardValidation() {
        return packageCardValidation.getText();
    }

    public String documentValidation() {
        return getDocumentTable.getText();
    }

    public void AddItemToAPackageWithRequiredFields() {
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
        detailsTextBox.sendKeys(textInDetails328i);
        additionalDetailsTextBox.sendKeys(textAdditionalDetails328i);
        disclaimerTextBox.sendKeys(disclaimer);
        locationDropdown.click();
        primaryLocation.click();
        estimatedValueTextBox.sendKeys(estimatedValue328i);
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemsValidation().contains(descriptionOfItem1));
        assertion.assertTrue(itemsValidation().contains(estimatedValue328i));
        BrowserUtils.waitFor(1);
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains(itemAudit328i));
    }

    public void AddItemToAPackageWithAllFields() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addItemTab.click();
        yearDropdown.click();
        year2014.click();
        makeDropdown.click();
        makeBMW.click();
        modelDropdown.click();
        modelThreeThirtyE.click();
        horsePowerTextBox.sendKeys(horsePower);
        detailsTextBox.sendKeys(textInDetails330e);
        additionalDetailsTextBox.sendKeys(textAdditionalDetails330e);
        disclaimerTextBox.sendKeys(disclaimer);
        locationDropdown.click();
        primaryLocation.click();
        stockNumberTextBox.sendKeys(stockNumber);
        assetTextBox.sendKeys(assetNumber);
        estimatedValueTextBox.sendKeys(estimatedValue330e);
        meterTypeDropdown.click();
        kilometersDropdown.click();
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemsValidation().contains(descriptionOfItem330e));
        assertion.assertTrue(itemsValidation().contains(estimatedValue330e));
        BrowserUtils.waitFor(1);
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains(itemAudit330e));
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
        detailsTextBox.sendKeys(textInDetailsM4);
        additionalDetailsTextBox.sendKeys(textAdditionalDetailsM4);
        disclaimerTextBox.sendKeys(disclaimer);
        locationDropdown.click();
        primaryLocation.click();
        estimatedValueTextBox.sendKeys(estimatedValueM4);
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemsValidation().contains(descriptionOfItem2));
        assertion.assertTrue(itemsValidation().contains(estimatedValueM4));
        BrowserUtils.waitFor(1);
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains(m4VinAudit));
    }

    public void AddItemsToAPackageFromFile() throws IOException, AWTException {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addItemsFromAFileTab.click();
        BrowserUtils.waitFor(1);
        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + mainHandle);
        driver.switchTo().window(mainHandle);
        browseButton.click();
        BrowserUtils.waitFor(3);
        Runtime.getRuntime().exec("osascript " + "/Users/michaelnkollo/Documents/UploadItemsInFile.scpt ");
        BrowserUtils.waitFor(13);
        importAllItemsButton.click();
        BrowserUtils.waitFor(20);
        xIconOnImportItemsProgressPage.click();
        BrowserUtils.waitFor(1);
        driver.navigate().refresh();
        BrowserUtils.waitFor(5);

    }

    public void deleteItemInAPackage() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        firstItemInItemSection.click();
        excludedItemsAccordion.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(excludedItemValidation().contains("2016 BMW 328I"));
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains("Excluded [2016 BMW 328I 31579]"));
        includeButtonFirstItem.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(itemInPackageValidation().contains("2016 BMW 328I"));
        BrowserUtils.waitFor(1);
        assertion.assertTrue(auditVerifications().contains("Included [2016 BMW 328I 31579]"));
    }

    public void addNotesToAPackage() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addNoteTabOnPackagePage.click();
        addNoteTextBox.sendKeys(sInstructions);
        saveButton.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(internalNotesSectionValidation().contains(sInstructions));
    }

    public void addValueServiceToAPackage() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addValueServiceTab.click();
        BrowserUtils.dropdownVisible(serviceDropdown, "Inspection");
        BrowserUtils.waitFor(2);
        quantityTextBox.sendKeys(quantity);
        markupTextBox.sendKeys(markUp);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(cost);
        BrowserUtils.waitFor(1);
        assertion.assertTrue(verifyPriceOfInspection().contains(priceOfI));
        saveButton.click();
        BrowserUtils.waitFor(1);
        valueServicesAccordion.click();
        assertion.assertTrue(valueServicesValidation().contains(quantity));
        assertion.assertTrue(valueServicesValidation().contains(markUp + "%"));
        assertion.assertTrue(valueServicesValidation().contains("$" + cost + ".00"));
        assertion.assertTrue(valueServicesValidation().contains(priceOfI));
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains(valueServicesAudit));
    }

    public void uploadDocumentInPackage() throws IOException {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        uploadDocumentTab.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitFor(1);
        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + mainHandle);
        driver.switchTo().window(mainHandle);
        browseButton.click();
        BrowserUtils.waitFor(1);
        Runtime.getRuntime().exec("osascript " + "/Users/michaelnkollo/Documents/uploadolx1.scpt ");
        BrowserUtils.waitFor(5);
        BrowserUtils.dropdownVisible(documentTypeDropdown, "Miscellaneous");
        descriptionTextBox.sendKeys("Test");
        BrowserUtils.waitFor(2);
        saveButtonOnUploadDoc.click();
        BrowserUtils.waitFor(2);
        documentsAccordion.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(documentValidation().contains("Miscellaneous"));
        Assert.assertTrue(documentValidation().contains("Test"));
    }

    public void editValueServiceToAPackage() {
        String quantityE = "3";
        String markUpE = "4";
        String costE = "150";
        String priceOfIE = "$468.00";
        String valueServicesAuditE = "Value Service Price changed from [210.00] to [468.00]";
        searchForPackage();
        BrowserUtils.waitFor(2);
        valueServicesAccordion.click();
        valueServiceEdit.click();
        BrowserUtils.dropdownVisible(serviceDropdown, "Storage");
        BrowserUtils.waitFor(2);
        quantityTextBox.sendKeys(quantityE);
        markupTextBox.sendKeys(markUpE);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(Keys.BACK_SPACE);
        costTextBox.sendKeys(costE);
        BrowserUtils.waitFor(1);
        assertion.assertTrue(verifyPriceOfInspection().contains(priceOfIE));
        saveButton.click();
        BrowserUtils.waitFor(1);
        valueServicesAccordion.click();
        assertion.assertTrue(valueServicesValidation().contains(quantityE));
        assertion.assertTrue(valueServicesValidation().contains(markUpE + "%"));
        assertion.assertTrue(valueServicesValidation().contains("$" + costE + ".00"));
        assertion.assertTrue(valueServicesValidation().contains(priceOfIE));
        auditAccordion.click();
        assertion.assertTrue(auditVerifications().contains(valueServicesAuditE));
    }

    public void removeValueServicesFromAPackage() {

        searchForPackage();
        BrowserUtils.waitFor(2);
        valueServicesAccordion.click();
        BrowserUtils.waitFor(1);
        valueServicesTrashIcon.click();
        yesButton.click();
    }

    public void addLienHolderToAPackage() {
        searchForPackage();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        addLienHolderTab.click();
        BrowserUtils.dropdownValue(lienHolderDropdown, "12760");
        BrowserUtils.dropdownValue(contactDropdown, "3719");
        saveButton.click();
        BrowserUtils.waitFor(1);
        lienHolderAccordion.click();
        assertion.assertTrue(lienHolderValidation().contains(contactName));
        assertion.assertTrue(lienHolderValidation().contains(accountName));
        assertion.assertTrue(lienHolderValidation().contains(status));
        BrowserUtils.waitFor(1);
        auditAccordion.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(auditVerifications().contains(lienAddedAuditMessage));
        assertion.assertTrue(auditVerifications().contains(valueServicesAuditDelete));

    }

    public void searchForPackage() {
        packagesTab.click();
        searchField.sendKeys(packageName);
        searchButton.click();
        createdAccount.click();
        BrowserUtils.waitFor(2);
    }

    public String itemsValidation() {
        return itemsSection.getText();
    }

    public String auditVerifications() {
        return auditVerification.getText();
    }

    public String verifyPriceOfInspection() {
        return priceBox.getText();
    }

    public String valueServicesValidation() {
        return valueServicesValidation.getText();
    }

    public String lienHolderValidation() {
        return lienHolderValidation.getText();
    }
}


