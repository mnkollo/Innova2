package pages;

import org.apache.poi.xwpf.usermodel.BreakType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.*;

import java.util.Locale;

public class AccountsPage extends BasePage {

    AllPages allPages = new AllPages();
    String companyName = FakeData.CompanyName();
    String companyName2 = FakeData.CompanyName();
    String accountEmail = FakeData.email();
    String accountPhone = "(472) 505-1768";
    String personalFirstName = FakeData.fakerFirstName();
    String personalLastName = FakeData.fakerLastName();

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

    //ActionMenu
    @FindBy(xpath = "//a[contains(text(),' Toggle Account View')]")
    public WebElement toggleAccountView;
    @FindBy(xpath = "//a[contains(text(),' Add Bank Account')]")
    public WebElement addBankAccount;

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

    //******************************************************

    public void createBusinessAccountAllData() {
        accountsTab.click();
        BrowserUtils.waitFor(2);
        gearIcon.click();
        createContactAction.click();
        accountName.sendKeys(companyName);
        searchButton.click();
        createNewAccount.click();
        contactFirstName.sendKeys(FakeData.fakerFirstName());
        contactLastName.sendKeys(FakeData.fakerLastName());
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
        Assert.assertEquals(accountCreated(), companyName.toUpperCase(Locale.ROOT) + " ");

    }
    public void toggleToAccountView(){
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

    public void accountCreatedDashboard() {
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName);
        searchButton.click();
        createdAccount.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(accountNameOnCollectionsView().contains(companyName.toUpperCase(Locale.ROOT) + " "));
    }

    public void searchAccount() {
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName2);
        searchButton.click();
        createdAccount.click();
        BrowserUtils.waitFor(2);
    }

    public String accountNameOnCollectionsView() {
        return accountNameOnCollectionsView.getText();
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
    }
    public void addBankAccount() {
        String bName = "Chase";
        String bAddress = FakeData.address();
        String bCity = "Fort Worth";
        String bZipcode = "76123";
        String bAccountHolderName = FakeData.randomName();
        String bBeneficiaryName = FakeData.randomName();
        searchAccount();
        toggleToAccountView();
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

    }

}
