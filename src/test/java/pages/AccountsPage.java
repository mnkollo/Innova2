package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.*;

import java.io.IOException;
import java.util.Locale;

import static utilities.Driver.driver;

public class AccountsPage extends BasePage {

    SoftAssert assertion = new SoftAssert();

    public AccountsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Account Page - Collections View
    @FindBy(xpath = "(//h4[contains(text(),'TRANSACTIONS')])[1]")
    public WebElement transactionsTab;
    @FindBy(xpath = "(//table[@class='w-100'])[1]")
    public WebElement newestTransaction;

    //account page - toggled view
    @FindBy(css = "[class$='card card'] div:nth-of-type(1) .link-color")
    public WebElement getEmailOnAccount;
    @FindBy(css = "[class$='card card'] div:nth-of-type(2) .link-color")
    public WebElement getPhoneNumberOnAccount;
    @FindBy(css = "[class$='card card'] div:nth-of-type(3) .link-color")
    public WebElement getWebsiteOnAccount;
    @FindBy(css = ".d-inline")
    public WebElement getAccountName;
    @FindBy(xpath = "(//div[@*='col-padding  col-12 col-sm-6 col-md-6 col-xl-4'])[2]")
    public WebElement contactCard;
    @FindBy(css = ".border-gray.card.false.p-top-5.pb-1 .fa.fa-pencil.font-xl")
    public WebElement salesAgreementPencilIcon;

    @FindBy(css = ".border-gray.card.false.p-top-5.pb-1")
    public WebElement salesAgreementCard;


    //ActionMenu
    @FindBy(xpath = "//a[contains(text(),' Toggle Account View')]")
    public WebElement toggleAccountView;
    @FindBy(xpath = "//a[contains(text(),' Add Bank Account')]")
    public WebElement addBankAccountTab;
    @FindBy(xpath = "//a[contains(text(),' Create Contact')]")
    public WebElement createContactTab;
    @FindBy(css = ".btn-square.button-dropdown.dropbtn.nav  .nav-link")
    public WebElement salesAgreementTab;
    @FindBy(xpath = "//a[contains(text(),' Location')]")
    public WebElement addLocationTab;
    @FindBy(xpath = "//a[contains(text(),' Add Note')]")
    public WebElement addNoteTab;
    @FindBy(xpath = "//a[contains(text(),' Collections Note')]")
    public WebElement addCollectionsNoteTab;
    @FindBy(xpath = "//a[contains(text(),'Apply Deposit')]")
    public WebElement applyDepositTab;
    @FindBy(xpath = "//a[contains(text(),'Refund Deposit')]")
    public WebElement refundDepositTab;
    @FindBy(xpath = "//a[contains(text(),'Create Package')]")
    public WebElement createPackageTab;

    //create account
    @FindBy(css = ".DropdownHoverLink")
    public WebElement createContactAction;
    @FindBy(id = "search_string")
    public WebElement accountNameField;
    @FindBy(xpath = "//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/h4[2]/div[1]")
    public WebElement accountNameOnCollectionsView;
    @FindBy(xpath = "//button[contains(text(),'Create New Account')]")
    public WebElement createNewAccount;
    @FindBy(id = "contactFirstName")
    public WebElement contactFirstName;
    @FindBy(id = "contactLastName")
    public WebElement contactLastName;
    @FindBy(id = "contactTitle")
    public WebElement contactTitle;
    @FindBy(id = "contactDepartment")
    public WebElement contactDepartment;
    @FindBy(id = "contactEmail")
    public WebElement contactEmail;
    @FindBy(id = "contactWorkPhone")
    public WebElement contactWorkPhone;
    @FindBy(id = "physicalPostalCode")
    public WebElement physicalPostalCode;
    @FindBy(id = "physicalCity")
    public WebElement physicalCity;
    @FindBy(id = "physicalState")
    public WebElement physicalState;
    @FindBy(id = "physicalLine1")
    public WebElement physicalLine1;
    @FindBy(css = ".switch-slider")
    public WebElement businessAccountSlider;
    @FindBy(id = "firstName")
    public WebElement firstNamePersonal;
    @FindBy(id = "lastName")
    public WebElement lastNamePersonal;
    @FindBy(id = "phone")
    public WebElement phoneNumberPersonal;

    //editAccount - Modal
    @FindBy(css = ".card-title.no-border > span > .fa.fa-pencil.font-xl")
    public WebElement editAccountIcon;
    @FindBy(id = "accountName")
    public WebElement accountNameField1;
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "phone")
    public WebElement phoneField;
    @FindBy(id = "webSite")
    public WebElement websiteField;

    //Apply Deposit - Modal
    @FindBy(id = "surcharge")
    public WebElement surchargeTextBox;
    @FindBy(name = "comment")
    public WebElement commentsTextBox;
    @FindBy(name = "method_ID")
    public WebElement paymentMethodDropdown;

    //CreateContact - Modal
    @FindBy(id = "email")
    public WebElement emailOnAccount;
    @FindBy(xpath = "//button[contains(text(),'Verify')]")
    public WebElement verifyButton;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "title")
    public WebElement title;
    @FindBy(id = "department")
    public WebElement department;
    @FindBy(id = "phone1")
    public WebElement phone1;
    @FindBy(id = "driverLicenseNumber")
    public WebElement driverLicenseNumber;
    @FindBy(name = "driverLicenseState")
    public WebElement driverLicenseStateDropdown;
    @FindBy(name = "driverLicenseCountry_ID")
    public WebElement driverLicenseCountryDropdown;
    @FindBy(css = ".form-control.react-datepicker-ignore-onclickoutside.undefined")
    public WebElement datePicker;

    //Add Location - Modal
    @FindBy(id = "locationName")
    public WebElement locationName;
    @FindBy(id = "postalCode")
    public WebElement postalCode;
    @FindBy(id = "phone")
    public WebElement locationPhone;
    @FindBy(id = "addressLine1")
    public WebElement locationAddress;
    @FindBy(xpath = "//div[contains(text(),'Select...')]")
    public WebElement locationContact;
    @FindBy(name = "notes")
    public WebElement internalLocationNotes;
    @FindBy(xpath = "/html/body/div/div/div[@role='dialog']/div[@role='document']//form//div[@class='col-6 col-md-8']/div/div/div/div/div[.='Bill Williams']")
    public WebElement firstContactName;

    @FindBy(xpath = "(//div[@class='col-padding col-12 col-sm-4 col-md-4 col-lg-3 col-xl-3'])[2]")
    public WebElement location2Card;

    //Create Sales Agreement from gear icon on account page
    @FindBy(id = "sellerLegalName")
    public WebElement sellerLegalName;
    @FindBy(name = "sellerContactID")
    public WebElement sellerAuthorizedRepDropdown;
    @FindBy(name = "paymentAddressID")
    public WebElement paymentAddress;
    @FindBy(name = "taxIDTypeID")
    public WebElement taxIDType;
    @FindBy(id = "payableToName")
    public WebElement payableToName;
    @FindBy(id = "taxIDNumber")
    public WebElement taxIDNumber;
    @FindBy(name = "bankAccount_ID")
    public WebElement bankAccountDropdown;
    @FindBy(id = "comission2500OrLess")
    public WebElement commission2500orless;
    @FindBy(id = "comissionOver2500")
    public WebElement commissionOver2500;
    @FindBy(id = "comissionPreAuction")
    public WebElement comissionPreAuction;
    @FindBy(css = ".collapse.show  .table-responsive")
    public WebElement getSalesAgreementTable;

    //Add Collections Note - Modal
    @FindBy(name = "generalNote")
    public WebElement addCollectionsNoteTextBox;
    @FindBy(css = ".container-fluid .row:nth-of-type(2) > [class] > .card:nth-of-type(3)")
    public WebElement collectionsLogSection;

    //Upload Document
    @FindBy(css = ".collapse.show  .table-responsive")
    public WebElement accountDocValidation;

    //AddBankAccount - Modal
    @FindBy(id = "bankName")
    public WebElement bankName;
    @FindBy(id = "bankAddress")
    public WebElement bankAddress;
    @FindBy(id = "bankCity")
    public WebElement bankCity;
    @FindBy(id = "bankZipCode")
    public WebElement bankZipcode;
    @FindBy(xpath = "(//div[contains(text(),'Select...')])[1]")
    public WebElement bankState;
    @FindBy(xpath = "//div[contains(text(),'Texas')]")
    public WebElement stateTexas;
    @FindBy(id = "bankAccountHolderName")
    public WebElement accountHolderName;
    @FindBy(id = "beneficiaryName")
    public WebElement beneficiaryName;
    @FindBy(xpath = "/html/body/div/div/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//form//div[@class='mx-1 row']/div/div/div/div/div/div[.='Select...']")
    public WebElement accountType;
    @FindBy(xpath = "//div[contains(text(),'Checking')]")
    public WebElement checkingAccount;
    @FindBy(id = "routingNumber")
    public WebElement routingNumber;
    @FindBy(id = "accountNumber")
    public WebElement accountNumber;
    @FindBy(id = "specialInstructions")
    public WebElement specialInstructions;
    @FindBy(id = "reference")
    public WebElement reference;
    @FindBy(css = ".collapse.show  .table-responsive")
    public WebElement bankInformationValidation;

    // Accordion
    @FindBy(css = "h5#bankInformation > .fa.fa-lg.fa-plus")
    public WebElement bankAccordion;
    @FindBy(css = "h5#contact > .fa.fa-lg.fa-plus")
    public WebElement contactsAccordion;
    @FindBy(css = "h5#salesAgreement > .fa.fa-lg.fa-plus")
    public WebElement salesAgreementAccordion;
    @FindBy(css = "h5#collectionsLog > .fa.fa-lg.fa-plus")
    public WebElement collectionsLogAccordion;

    @FindBy(xpath = "//h5[@id='documents']/i")
    public WebElement documentsAccordionAccountsPage;


    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/form/div[3]/button[2]")
    public WebElement saveButtonOnAccountPage;

    //******************************************************


    public void clickCreatePackage() {
        createPackageTab.click();
    }

    public String accountDocValidation() {
        return accountDocValidation.getText();
    }

    public String bankInfoValidation() {
        return bankInformationValidation.getText();
    }

    public String collectionsLogValidation() {
        return collectionsLogSection.getText();
    }

    public String additionalContactValidation() {
        return contactCard.getText();
    }

    public String salesAgreementCardValidation() {
        return salesAgreementCard.getText();
    }

    public String salesAgreementTableValidation() {
        return getSalesAgreementTable.getText();
    }

    public String location2CardValidation() {
        return location2Card.getText();
    }

    public String accountCreated() {
        return getAccountName.getText();
    }


    public String emailVerificationOnAccountPage() {
        return getEmailOnAccount.getText();
    }

    public String phoneVerificationOnAccountPage() {
        return getPhoneNumberOnAccount.getText();
    }

    public String websiteVerificationOnAccountPage() {
        return getWebsiteOnAccount.getText();
    }

    public void searchForAccount() {
        accountsTab.click();
        BrowserUtils.waitFor(3);
        searchField.sendKeys(testingCompanyName);
        searchButton.click();
        BrowserUtils.waitFor(3);
        createdAccount.click();
        BrowserUtils.waitFor(2);
    }
    public void validateStatus() {
        transactionsTab.click();

    }

    public String accountNameOnCollectionsView() {
        return accountNameOnCollectionsView.getText();
    }

    public void accountCreatedDashboard() {
        searchForAccount();
        BrowserUtils.waitFor(6);
        Assert.assertTrue(accountNameOnCollectionsView().contains(companyName.toUpperCase() + " "));
    }

    public void createBusinessAccountAllData() {
        accountsTab.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        createContactAction.click();
        BrowserUtils.waitFor(1);
        accountNameField.sendKeys(companyName);
        searchButton.click();
        createNewAccount.click();
        BrowserUtils.waitFor(2);
        contactFirstName.sendKeys(contactFN);
        contactLastName.sendKeys(contactLN);
        contactTitle.sendKeys(FakeData.randomName());
        contactDepartment.sendKeys(FakeData.randomName());
        contactEmail.sendKeys(accountEmail);
        contactWorkPhone.sendKeys(FakeData.phoneNumber());
        physicalPostalCode.sendKeys("76123");
        physicalLine1.sendKeys(contactAddress);
        saveButton.click();
        BrowserUtils.waitFor(5);
        gearIcon.click();
        toggleAccountView.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(accountCreated(), companyName.toUpperCase(Locale.ROOT) + " ");
    }
    public void createPersonalAccount() {
        accountsTab.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        createContactAction.click();
        businessAccountSlider.click();
        firstNamePersonal.sendKeys(personalFirstName);
        lastNamePersonal.sendKeys(personalLastName);
        phoneNumberPersonal.sendKeys(FakeData.phoneNumber());
        searchButton.click();
        createNewAccount.click();
        contactTitle.sendKeys(FakeData.randomName());
        contactDepartment.sendKeys(FakeData.randomName());
        contactEmail.sendKeys(FakeData.email());
        contactWorkPhone.sendKeys(FakeData.phoneNumber());
        physicalPostalCode.sendKeys("76123");
        physicalLine1.sendKeys(FakeData.address());
        BrowserUtils.waitFor(2);
        saveButton.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        toggleAccountView.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(accountCreated().contains(personalFirstName.toUpperCase(Locale.ROOT) + " "));
        BrowserUtils.waitFor(1);
    }
    public void editAccount() {
        String websiteName = FakeData.website();
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName);
        searchButton.click();
        createdAccount.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        toggleAccountView.click();
        editAccountIcon.click();
        BrowserUtils.waitFor(1);
        accountNameField1.clear();
        accountNameField1.sendKeys(companyName2);
        saveButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(accountCreated(), companyName2.toUpperCase(Locale.ROOT) + " ");
        editAccountIcon.click();
        emailField.clear();
        emailField.sendKeys(accountEmail);
        saveButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(emailVerificationOnAccountPage(), accountEmail);
        editAccountIcon.click();
        phoneField.clear();
        phoneField.sendKeys(accountPhone);
        saveButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(phoneVerificationOnAccountPage(), accountPhone);
        editAccountIcon.click();
        websiteField.clear();
        websiteField.sendKeys(websiteName);
        saveButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(websiteVerificationOnAccountPage(), websiteName);
        editAccountIcon.click();
        accountNameField1.clear();
        accountNameField1.sendKeys(companyName);
        saveButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(accountCreated(), companyName.toUpperCase(Locale.ROOT) + " ");
    }
    public void createContact() {
        searchForAccount();
        BrowserUtils.waitFor(2);
        navigateToActionMenuFromNormalView();
        createContactTab.click();
        emailOnAccount.sendKeys(createContactEmail);
        verifyButton.click();
        firstName.sendKeys(firstNameContact);
        lastName.sendKeys(lastNameContact);
        title.sendKeys(titleContact);
        department.sendKeys(departmentContact);
        phone1.sendKeys(phoneContact);
        driverLicenseNumber.sendKeys(licenceNumberContact);
        BrowserUtils.dropdownIndex(driverLicenseStateDropdown, 45);
        BrowserUtils.dropdownIndex(driverLicenseCountryDropdown, 0);
        saveButton.click();
        BrowserUtils.waitFor(2);
        contactsAccordion.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(additionalContactValidation().contains(firstNameContact));
        Assert.assertTrue(additionalContactValidation().contains(lastNameContact));
        Assert.assertTrue(additionalContactValidation().contains(titleContact));
        Assert.assertTrue(additionalContactValidation().contains(phoneContact));
        Assert.assertTrue(additionalContactValidation().contains("Yes"));
    }
    public void addBankAccount() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        addBankAccountTab.click();
        BrowserUtils.waitFor(1);
        bankName.sendKeys(bName);
        bankAddress.sendKeys(bAddress);
        bankCity.sendKeys(bCity);
        bankZipcode.sendKeys(bZipcode);
        bankState.click();
        stateTexas.click();
        accountHolderName.sendKeys(bAccountHolderName);
        beneficiaryName.sendKeys(bBeneficiaryName);
        BrowserUtils.waitFor(1);
        accountType.click();
        checkingAccount.click();
        routingNumber.sendKeys(rNumber);
        accountNumber.sendKeys(aNumber);
        specialInstructions.sendKeys(sInstructions);
        reference.sendKeys(rNumber);
        saveButton.click();
        BrowserUtils.waitFor(2);
        bankAccordion.click();
        BrowserUtils.waitFor(4);
        assertion.assertTrue(bankInfoValidation().contains(bName));
        assertion.assertTrue(bankInfoValidation().contains(bAddress));
        assertion.assertTrue(bankInfoValidation().contains(bCity));
        assertion.assertTrue(bankInfoValidation().contains(bZipcode));
        assertion.assertTrue(bankInfoValidation().contains(bAccountHolderName));
        assertion.assertTrue(bankInfoValidation().contains(rNumber));
        assertion.assertTrue(bankInfoValidation().contains(aNumber));
        assertion.assertTrue(bankInfoValidation().contains(sInstructions));
        assertion.assertAll();
    }
    public void createSalesAgreement() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        salesAgreementTab.click();
        BrowserUtils.waitFor(3);
        sellerLegalName.sendKeys(companyName);
        BrowserUtils.waitFor(5);
        BrowserUtils.dropdownVisible(sellerAuthorizedRepDropdown, contactFN + " " + contactLN);
        BrowserUtils.waitFor(3);
        BrowserUtils.dropdownVisible(paymentAddress, "Primary " + contactAddress);
        BrowserUtils.dropdownVisible(taxIDType, "Dealer");
        payableToName.sendKeys(payableName);
        taxIDNumber.sendKeys(taxID);
        BrowserUtils.dropdownVisible(bankAccountDropdown, "Pay by check");
        commission2500orless.sendKeys(randomNumber1);
        commissionOver2500.sendKeys(randomNumber2);
        comissionPreAuction.sendKeys(randomNumber3);
        saveIcon.click();
        accountHeader.click();
        BrowserUtils.waitFor(1);
        toggleToNormalAccountView();
        BrowserUtils.waitFor(3);
        assertion.assertTrue(salesAgreementCardValidation().contains(payableName));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber1 + ".00%"));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber2 + ".00%"));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber3 + ".00%"));
        salesAgreementAccordion.click();
        salesAgreementTableValidationForFirstSA();
        BrowserUtils.waitFor(1);
        assertion.assertAll();
        BrowserUtils.waitFor(1);
    }
    public void salesAgreementTableValidationForFirstSA() {
        assertion.assertTrue(salesAgreementTableValidation().contains(payableName));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber1 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber2 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber3 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains("v1"));
        assertion.assertTrue(salesAgreementTableValidation().contains("Executed"));
    }
    public void createSalesAgreementOnExistingSalesAgreement() {
        searchForAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        salesAgreementPencilIcon.click();
        BrowserUtils.waitFor(2);
        createNewIcon.click();
        createNewIcon.click();
        BrowserUtils.waitFor(3);
        sellerLegalName.sendKeys(companyName2);
        BrowserUtils.dropdownVisible(sellerAuthorizedRepDropdown, firstNameContact + " " + lastNameContact);
        BrowserUtils.dropdownVisible(paymentAddress, "Primary " + contactAddress);
        BrowserUtils.dropdownVisible(taxIDType, "Dealer");
        payableToName.sendKeys(payableName1);
        taxIDNumber.sendKeys(taxID1);
        BrowserUtils.dropdownVisible(bankAccountDropdown, "Pay by check");
        commission2500orless.sendKeys(randomNumber4);
        commissionOver2500.sendKeys(randomNumber5);
        comissionPreAuction.sendKeys(randomNumber6);
        saveIcon.click();
        accountHeader.click();
        BrowserUtils.waitFor(1);
        toggleToNormalAccountView();
        assertion.assertTrue(salesAgreementCardValidation().contains(payableName1));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber4 + ".00%"));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber5 + ".00%"));
        assertion.assertTrue(salesAgreementCardValidation().contains(randomNumber6 + ".00%"));
        salesAgreementAccordion.click();
        BrowserUtils.waitFor(1);
        assertion.assertTrue(salesAgreementTableValidation().contains(payableName1));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber4 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber5 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber6 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains("v2"));
        assertion.assertTrue(salesAgreementTableValidation().contains("Executed"));
        salesAgreementTableValidationForFirstSA();
        BrowserUtils.waitFor(1);
        assertion.assertAll();
        BrowserUtils.waitFor(1);
    }
    public void addLocationToAnAccount() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        addLocationTab.click();
        BrowserUtils.waitFor(2);
        locationName.sendKeys(nameOfLocation);
        locationAddress.sendKeys(addressOfLocation);
        postalCode.sendKeys(postalCodeLocation);
        locationPhone.sendKeys(locationPhoneNumber);
        locationContact.click();
        BrowserUtils.waitFor(2);
        firstContactName.click();
        BrowserUtils.waitFor(1);
        saveButton.click();
        BrowserUtils.waitFor(1);
        locationsAccordionPlus.click();
        BrowserUtils.waitFor(2);
    }
    public void verifyNewLocationAddedToAccount() {
        assertion.assertTrue(location2CardValidation().contains(nameOfLocation));
        assertion.assertTrue(location2CardValidation().contains(addressOfLocation));
        assertion.assertTrue(location2CardValidation().contains(postalCodeLocation));
        assertion.assertTrue(location2CardValidation().contains(locationPhoneNumber));
        assertion.assertAll();
    }
    public void addNoteToAnAccount() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        addNoteTab.click();
        addNoteTextBox.sendKeys(sInstructions);
        saveButton.click();
        BrowserUtils.waitFor(1);
    }
    public void VerifyNoteIsAdded() {
        assertion.assertTrue(internalNotesSectionValidation().contains(sInstructions));
    }

    public void AddCollectionsNoteOnAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        addCollectionsNoteTab.click();
        addCollectionsNoteTextBox.sendKeys(fakeText);
        saveButton.click();
        BrowserUtils.waitFor(2);
        collectionsLogAccordion.click();
    }
    public void VerifyCollectionsNoteOnAccountPage() {
        assertion.assertTrue(collectionsLogValidation().contains(fakeText));
        assertion.assertTrue(collectionsLogValidation().contains("Michael Nkollo (SU)"));
    }
    public void uploadDocumentOnAccountPage() throws IOException {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        uploadDocumentTab.click();
        BrowserUtils.waitFor(2);
//        BrowserUtils.dropdownVisible(documentTypeDropdown, "Miscellaneous");
//        descriptionTextBox.sendKeys("Test");
        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + mainHandle);
        driver.switchTo().window(mainHandle);
        String mainHandle1 = driver.getWindowHandle();
        System.out.println("Main Window ID: " + mainHandle);
        driver.switchTo().window(mainHandle1);
        browseButton.click();
        BrowserUtils.waitFor(2);
        Runtime.getRuntime().exec("osascript " + "/Users/michaelnkollo/Documents/uploadolx2.scpt ");
        BrowserUtils.waitFor(5);
        BrowserUtils.dropdownVisible(documentTypeDropdown, "Miscellaneous");
        descriptionTextBox.sendKeys("Test");
        BrowserUtils.waitFor(3);
        saveButton.click();                         //TODO fix this
        BrowserUtils.waitFor(9);
        documentsAccordionAccountsPage.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(accountDocValidation().contains("Miscellaneous"));
        Assert.assertTrue(accountDocValidation().contains("Test"));
    }
    public void applyDepositByWireTransferToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(wireframeDeposit);
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(wireframeDeposit));
        assertion.assertTrue(getNewestTransaction().contains("Wire Transfer"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        BrowserUtils.waitFor(2);
    }
    public String getNewestTransaction() {
        return newestTransaction.getText();
    }
    public void applyDepositByMoneyOrderToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(moneyOrderDeposit);
        BrowserUtils.dropdownVisible(paymentMethodDropdown, "Money Order");
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(moneyOrderDeposit));
        assertion.assertTrue(getNewestTransaction().contains("Money Order"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains(moneyOrderDeposit + " DEPOSIT APPLIED"));
    }
    public void applyDepositByACHToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(achDeposit);
        BrowserUtils.dropdownVisible(paymentMethodDropdown, "ACH");
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(achDeposit));
        assertion.assertTrue(getNewestTransaction().contains("ACH"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains(achDeposit + " DEPOSIT APPLIED"));
    }
    public void applyDepositByCheckToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(checkDeposit);
        BrowserUtils.dropdownVisible(paymentMethodDropdown, "Check");
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(checkDeposit));
        assertion.assertTrue(getNewestTransaction().contains("Check"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains(checkDeposit + " DEPOSIT APPLIED"));
    }
    public void applyDepositByCashToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(cashDeposit);
        BrowserUtils.dropdownVisible(paymentMethodDropdown, "Cash");
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(cashDeposit));
        assertion.assertTrue(getNewestTransaction().contains("Cash"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains(cashDeposit + " DEPOSIT APPLIED"));
    }
    public void applyDepositByCreditCardToAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        applyDepositTab.click();
        amountTextBox.sendKeys(creditCardDeposit);
        BrowserUtils.dropdownVisible(paymentMethodDropdown, "Credit Card");
        surchargeTextBox.sendKeys(surcharge);
        commentsTextBox.sendKeys(sInstructions);
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains(creditCardDeposit));
        assertion.assertTrue(getNewestTransaction().contains("Credit Card"));
        assertion.assertTrue(getNewestTransaction().contains("Deposit"));
        assertion.assertTrue(getNewestTransaction().contains("Posted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains(sInstructions));
        assertion.assertTrue(internalNotesSectionValidation().contains(creditCardDeposit + " DEPOSIT APPLIED"));
    }
    public void verifyUserCanRefundDepositFromAccountPage() {
        searchForAccount();
        navigateToActionMenuFromNormalView();
        refundDepositTab.click();
        amountTextBox.sendKeys(refundAmount);
        saveButton.click();
        BrowserUtils.waitFor(1);
        transactionsTab.click();
        assertion.assertTrue(getNewestTransaction().contains("-" + refundAmount));
        assertion.assertTrue(getNewestTransaction().contains("Check"));
        assertion.assertTrue(getNewestTransaction().contains("Refund"));
        assertion.assertTrue(getNewestTransaction().contains("Unposted"));
        toggleToNormalAccountView();
        assertion.assertTrue(internalNotesSectionValidation().contains("Deposit Refund Requested"));
    }

    public void createOpenPackage(){
        navigateToActionMenuFromNormalView();
        createPackageTab.click();
        BrowserUtils.waitFor(1);
        allPages.packagesPage().descriptionTextBox.sendKeys(FakeData.randomName());
        BrowserUtils.dropdownVisible(allPages.packagesPage().typeDropdown,"Consignment");
        BrowserUtils.dropdownVisible(allPages.packagesPage().saleFormatDropdown,"Cascade");
        BrowserUtils.dropdownValue(allPages.packagesPage().agreementTypeDropdown,"2");
        saveButton.click();
        BrowserUtils.waitFor(1);
        Assert.assertEquals(allPages.packagesPage().getPackageStatusValidation(),"Open");
    }
}
