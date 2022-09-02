package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.FakeData;

import java.util.Locale;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AllPages allPages = new AllPages();
    String companyName = FakeData.CompanyName();
    String testingCompanyName = "ANDERSON, CASPER AND BRAUN";
    String packageName = FakeData.randomName();
    String companyName2 = FakeData.CompanyName();
    String accountEmail = FakeData.email();
    String createContactEmail = FakeData.email();
    String accountPhone = "(472) 505-1768";
    String contactFN = "Arnoldo";
    String contactLN = "West";
    String personalFirstName = FakeData.fakerFirstName();
    String personalLastName = FakeData.fakerLastName();
    String bName = "Chase";
    String bAddress = FakeData.address();
    String bCity = "Fort Worth";
    String bZipcode = "76123";
    String bAccountHolderName = FakeData.randomName();
    String bBeneficiaryName = FakeData.randomName();
    CharSequence rNumber = FakeData.random9DigitAccountNumber();
    CharSequence aNumber = FakeData.random9DigitAccountNumber();
    String sInstructions = "This is just some random text im going to use to verify this field is working";
    String fakeText = "This is just some random text dont pay attention to what im putting in this section. Im just testing something";
    String firstNameContact = FakeData.fakerFirstName();
    String lastNameContact = FakeData.fakerLastName();
    String titleContact = FakeData.profession();
    String departmentContact = FakeData.profession();
    String phoneContact = "(144) 305-6272";
    String contactAddress = FakeData.address();
    CharSequence licenceNumberContact = FakeData.random9DigitAccountNumber();
    CharSequence taxID = FakeData.random9DigitAccountNumber();
    CharSequence taxID1 = FakeData.random9DigitAccountNumber();
    String payableName = FakeData.randomName();
    String payableName1 = FakeData.randomName();
    String randomNumber1 = FakeData.randomNumber();
    String randomNumber2 = FakeData.randomNumber();
    String randomNumber3 = FakeData.randomNumber();
    String randomNumber4 = FakeData.randomNumber();
    String randomNumber5 = FakeData.randomNumber();
    String randomNumber6 = FakeData.randomNumber();
    String nameOfLocation = FakeData.CompanyName();
    String addressOfLocation = FakeData.address();
    String postalCodeLocation = "75001";
    String locationPhoneNumber = "(214) 495-8425";
    CharSequence wireframeDeposit = "50";
    CharSequence achDeposit = "75";
    CharSequence moneyOrderDeposit = "85";
    CharSequence checkDeposit = "95";
    CharSequence cashDeposit = "95";
    CharSequence creditCardDeposit = "100";
    CharSequence surcharge = "20";
    CharSequence refundAmount = "95";

    String textInDetails = "2019 BMW 328i Runs and looks like new, Camera, Parking Sensors, etc. Comes with a free one month or 1000 miles Free Warranty! ";
    String textInDetails2 = "We prefer the 2020 M4 coupe versus its convertible counterpart, especially since it's $8500 cheaper. Likewise, the M4 CS may appeal to the most ardent BMW fans, but we don't think the marginal performance enhancements warrant its six-figure price tag";
    String textAdditionalDetails = "No accidents or damage reported to CARFAX";
    String textAdditionalDetails2 = "The EPA has different estimates between the M4's two body styles and transmission";
    String disclaimer = "Features and options are descriptive of what can be expected on the vehicle. Actual options should be verified by the customer and dealer. Plus government fees and taxes, any finance charges, any dealer document processing charge, any electronic filing charge, and any emission testing charge. Please contact dealer to confirm price and vehicle availability. Current mileage may vary due to test drives and vehicle relocation.";
    String descriptionOfItem1 = "2019 BMW 328I";
    String descriptionOfItem2 = "2020 BMW M4";
    String estimatedValue = "47000";
    String estimatedValue2 = "65000";
    String vinNumber = "WBS4Y9C0XLFJ49181";

//----------------------------------------------------------------------------------------------------------------
    String successMessage = "Dashboard Not Configured";

    @FindBy(xpath = "//h1[contains(text(),'Dashboard Not Configured')]")
    public WebElement dashboardNotConfiguredMessage;

    //ELEMENTS

    @FindBy(id = "amount")
    public WebElement amountTextBox;
    @FindBy(name = "text")
    public WebElement addNoteTextBox;
    @FindBy(id = "simple-search-field")
    public WebElement searchField;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement searchButton;
    @FindBy(css = ".a-table > td:nth-of-type(1)")
    public WebElement createdAccount;

    //gear Icon
    @FindBy(xpath = "//a[contains(text(),' Add Note')]")
    public WebElement addNoteTab;
    @FindBy(css = ".btn-square.button-dropdown.dropbtn.nav")
    public WebElement gearIcon;

    //Buttons for modal pages
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(xpath = "//span[contains(text(),'Browse')]")
    public WebElement browseButton;
    @FindBy(xpath = "//button[contains(text(),'No')]")
    public WebElement noButton;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    public WebElement yesButton;


    //BACK OFFICE MENU
    @FindBy(css = ".nav > li:nth-of-type(3) > .nav-link")
    public WebElement accountsTab;
    @FindBy(xpath = "//a[contains(text(),'Work Order Board')]")
    public WebElement workOrderBoard;

    @FindBy(xpath = "//a[contains(text(),'Packages')]")
    public WebElement packagesTab;



    //Header Banner
    @FindBy(css=".btn.btn-square.btn-success.save-button > .fa.fa-lg.fa-save")
    public WebElement saveIcon;
    @FindBy(css="i#undo")
    public WebElement createNewIcon;

    @FindBy(css = ".breadcrumb > li:nth-of-type(2) > a")
    public WebElement accountHeader;

    //----------------------------------------------------------------------------------------------------------

    //Methods
    public String loginSuccess() {
        return dashboardNotConfiguredMessage.getText();
    }
    public void loginSuccessfully(){
        Assert.assertTrue(loginSuccess().contains(successMessage));
    }

}

