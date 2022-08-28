package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.*;

import java.util.Locale;

public class AccountsPage extends BasePage {

    SoftAssert assertion = new SoftAssert();

    public AccountsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //account page - toggled view
    @FindBy(id = "simple-search-field")
    public WebElement searchField;
    @FindBy(css = ".a-table > td:nth-of-type(1)")
    public WebElement createdAccount;
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
    public WebElement addBankAccount;
    @FindBy(xpath = "//a[contains(text(),' Create Contact')]")
    public WebElement createContact;
    @FindBy(css = ".btn-square.button-dropdown.dropbtn.nav  .nav-link")
    public WebElement salesAgreement;
    @FindBy(xpath = "//a[contains(text(),' Location')]")
    public WebElement addLocation;

    //create account
    @FindBy(css = ".DropdownHoverLink")
    public WebElement createContactAction;
    @FindBy(id = "search_string")
    public WebElement accountName;
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
    public WebElement accountNameField;
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "phone")
    public WebElement phoneField;
    @FindBy(id = "webSite")
    public WebElement websiteField;

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
    @FindBy(css = "div[class^=\"react-select__value\"]")
    public WebElement locationContact;
    @FindBy(name = "notes")
    public WebElement internalLocationNotes;
    @FindBy(xpath = "//div[contains(text(),'Arnoldo West')]")
    public WebElement firstContactName;

    @FindBy(xpath = "(//div[@class='no-padding contact-card account-item card'])[3]")
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
    @FindBy(name="bankAccount_ID")
    public WebElement bankAccountDropdown;
    @FindBy(id="comission2500OrLess")
    public WebElement commission2500orless;
    @FindBy(id="comissionOver2500")
    public WebElement commissionOver2500;
    @FindBy(id="comissionPreAuction")
    public WebElement comissionPreAuction;
    @FindBy(css = ".collapse.show  .table-responsive")
    public WebElement salesAgreementTable;

    //AddBankAccount - Modal
    @FindBy(id="bankName")
    public WebElement bankName;
    @FindBy(id="bankAddress")
    public WebElement bankAddress;
    @FindBy(id="bankCity")
    public WebElement bankCity;
    @FindBy(id="bankZipCode")
    public WebElement bankZipcode;
    @FindBy(xpath="(//div[contains(text(),'Select...')])[1]")
    public WebElement bankState;
    @FindBy(xpath="//div[contains(text(),'Texas')]")
    public WebElement stateTexas;
    @FindBy(id="bankAccountHolderName")
    public WebElement accountHolderName;
    @FindBy(id="beneficiaryName")
    public WebElement beneficiaryName;
    @FindBy(xpath="/html/body/div/div/div[@role='dialog']/div[@role='document']/div[@class='modal-content']//form//div[@class='mx-1 row']/div/div/div/div/div/div[.='Select...']")
    public WebElement accountType;
    @FindBy(xpath="//div[contains(text(),'Checking')]")
    public WebElement checkingAccount;
    @FindBy(id="routingNumber")
    public WebElement routingNumber;
    @FindBy(id="accountNumber")
    public WebElement accountNumber;
    @FindBy(id="specialInstructions")
    public WebElement specialInstructions;
    @FindBy(id="reference")
    public WebElement reference;
    @FindBy(xpath="//*[@id=\"react-root\"]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[10]/div[2]/div[2]/div/div/table")
    public WebElement bankInformationValidation;

    //Contact Accordion
    @FindBy(css="h5#bankInformation > .fa.fa-lg.fa-plus")
    public WebElement bankAccordion;
    @FindBy(css="h5#contact > .fa.fa-lg.fa-plus")
    public WebElement contactsAccordion;
    @FindBy(css="h5#salesAgreement > .fa.fa-lg.fa-plus")
    public WebElement salesAgreementAccordion;
    @FindBy(css="h5#locations > .fa.fa-lg.fa-plus")
    public WebElement locationsAccordion;






    //******************************************************

    public void createBusinessAccountAllData() {
        accountsTab.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        createContactAction.click();
        accountName.sendKeys(companyName);
        searchButton.click();
        createNewAccount.click();
        contactFirstName.sendKeys(contactFN);
        contactLastName.sendKeys(contactLN);
        contactTitle.sendKeys(FakeData.randomName());
        contactDepartment.sendKeys(FakeData.randomName());
        contactEmail.sendKeys(FakeData.email());
        contactWorkPhone.sendKeys(FakeData.phoneNumber());
        physicalPostalCode.sendKeys("76123");
        //physicalCity.sendKeys(FakeData.city());             //After entering the zipcode smarty streets automatically enters the city and state
        //physicalState.sendKeys(FakeData.fakerState());
        physicalLine1.sendKeys(contactAddress);
        saveButton.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        toggleAccountView.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(accountCreated(), companyName.toUpperCase(Locale.ROOT) + " ");

    }
    public String bankInfoValidation(){
        return bankInformationValidation.getText();
    }
    public String additionalContactValidation(){
        return contactCard.getText();
    }

    public String salesAgreementCardValidation(){
        return salesAgreementCard.getText();
    }
    public String salesAgreementTableValidation(){
        return salesAgreementTable.getText();
    }
    public String location2CardValidation(){
        return location2Card.getText();
    }
    public void toggleToNormalAccountView(){
        BrowserUtils.waitFor(1);
        gearIcon.click();
        BrowserUtils.waitFor(1);
        toggleAccountView.click();
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

    public void searchAccount() {
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName);
        searchButton.click();

        if (!createdAccount.isEnabled()) {
            searchField.clear();
            searchField.clear();
            searchField.sendKeys(companyName2);
            searchButton.click();
        }
        createdAccount.click();
        BrowserUtils.waitFor(2);
    }

    public String accountNameOnCollectionsView() {
        return accountNameOnCollectionsView.getText();
    }
    public void accountCreatedDashboard() {
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName);
        searchButton.click();
        createdAccount.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(accountNameOnCollectionsView().contains(companyName.toUpperCase(Locale.ROOT) + " "));
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
        //physicalCity.sendKeys(FakeData.city());             //After entering the zipcode smarty streets automatically enters the city and state
        //physicalState.sendKeys(FakeData.fakerState());
        physicalLine1.sendKeys(FakeData.address());
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
        accountNameField.clear();
        accountNameField.sendKeys(companyName2);
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
    }
    public void createContact(){
        searchAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        gearIcon.click();
        createContact.click();
        emailOnAccount.sendKeys(createContactEmail);
        verifyButton.click();
        firstName.sendKeys(firstNameContact);
        lastName.sendKeys(lastNameContact);
        title.sendKeys(titleContact);
        department.sendKeys(departmentContact);
        phone1.sendKeys(phoneContact);
        driverLicenseNumber.sendKeys(licenceNumberContact);
        BrowserUtils.dropdownIndex(driverLicenseStateDropdown,45);
        BrowserUtils.dropdownIndex(driverLicenseCountryDropdown,0);
        saveButton.click();
        BrowserUtils.waitFor(2);
        contactsAccordion.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(additionalContactValidation().contains(firstNameContact));
        Assert.assertTrue(additionalContactValidation().contains(lastNameContact));
        Assert.assertTrue(additionalContactValidation().contains(titleContact));
        Assert.assertTrue(additionalContactValidation().contains(phoneContact));
        Assert.assertTrue(additionalContactValidation().contains("Yes"));

    }
    public void addBankAccount() {
        searchAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        gearIcon.click();
        addBankAccount.click();
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
        BrowserUtils.waitFor(2);
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
        searchAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        gearIcon.click();
        salesAgreement.click();
        BrowserUtils.waitFor(2);
        sellerLegalName.sendKeys(companyName2);
        BrowserUtils.dropdownVisible(sellerAuthorizedRepDropdown, contactFN + " " + contactLN);
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
        toggleToNormalAccountView();
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
    public void salesAgreementTableValidationForFirstSA(){
        assertion.assertTrue(salesAgreementTableValidation().contains(payableName));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber1 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber2 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains(randomNumber3 + ".00%"));
        assertion.assertTrue(salesAgreementTableValidation().contains("v1"));
        assertion.assertTrue(salesAgreementTableValidation().contains("Executed"));

    }
    public void createSalesAgreementOnExistingSalesAgreement() {
        searchAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        salesAgreementPencilIcon.click();
        createNewIcon.click();
        createNewIcon.click();
        BrowserUtils.waitFor(1);
        sellerLegalName.sendKeys(companyName2);
        BrowserUtils.dropdownVisible(sellerAuthorizedRepDropdown,firstNameContact + " " + lastNameContact);
        BrowserUtils.dropdownVisible(paymentAddress,"Primary " +contactAddress );
        BrowserUtils.dropdownVisible(taxIDType,"Dealer" );
        payableToName.sendKeys(payableName1);
        taxIDNumber.sendKeys(taxID1);
        BrowserUtils.dropdownVisible(bankAccountDropdown,"Pay by check");
        commission2500orless.sendKeys(randomNumber4);
        commissionOver2500.sendKeys(randomNumber5);
        comissionPreAuction.sendKeys(randomNumber6);
        saveIcon.click();
        accountHeader.click();
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
    public void addLocationToAnAccount(){
        searchAccount();
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        gearIcon.click();
        addLocation.click();
        BrowserUtils.waitFor(2);
        locationName.sendKeys(nameOfLocation);
        locationAddress.sendKeys(addressOfLocation);
        postalCode.sendKeys(postalCodeLocation);
        locationPhone.sendKeys(locationPhoneNumber);
        locationContact.click();
        BrowserUtils.waitFor(1);
        firstContactName.click();
        saveButton.click();
        BrowserUtils.waitFor(1);
        locationsAccordion.click();
        BrowserUtils.waitFor(2);
        assertion.assertTrue(location2CardValidation().contains(nameOfLocation));
        assertion.assertTrue(location2CardValidation().contains(addressOfLocation));
        assertion.assertTrue(location2CardValidation().contains(postalCodeLocation));
        assertion.assertTrue(location2CardValidation().contains(locationPhoneNumber));
        assertion.assertAll();

    }
}
