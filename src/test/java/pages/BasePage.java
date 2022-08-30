package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.AllPages;
import utilities.Driver;
import utilities.FakeData;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AllPages allPages = new AllPages();
    String companyName = FakeData.CompanyName();
    String testingCompanyName = "CHAMPLIN INC";
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

//----------------------------------------------------------------------------------------------------------------
    String successMessage = "Dashboard Not Configured";

    @FindBy(xpath = "//h1[contains(text(),'Dashboard Not Configured')]")
    public WebElement dashboardNotConfiguredMessage;

    //ELEMENTS
    @FindBy(css = ".btn-square.button-dropdown.dropbtn.nav")
    public WebElement gearIcon;

    //Buttons for modal pages
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    //BACK OFFICE MENU
    @FindBy(css = ".nav > li:nth-of-type(3) > .nav-link")
    public WebElement accountsTab;

    //Search Bar
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement searchButton;

    //Header Banner
    @FindBy(css=".btn.btn-square.btn-success.save-button > .fa.fa-lg.fa-save")
    public WebElement saveIcon;
    @FindBy(css="i#undo")
    public WebElement createNewIcon;

    @FindBy(css = ".breadcrumb > li:nth-of-type(2) > a")
    public WebElement accountHeader;


    //Methods
    public String loginSuccess() {
        return dashboardNotConfiguredMessage.getText();
    }
    public void loginSuccessfully(){
        Assert.assertTrue(loginSuccess().contains(successMessage));
    }
}

