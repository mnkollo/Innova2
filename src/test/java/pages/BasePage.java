package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.FakeData;

import java.util.Set;

import static utilities.Driver.driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AllPages allPages = new AllPages();
    public String companyName = FakeData.CompanyName() + " Auto Account";
    String testingCompanyName = "ROMAGUERA, GRADY AND KUPHAL";
    String packageName = FakeData.randomName();
    String testingPackageName = "KIHN LLC";
    public String companyName2 = FakeData.CompanyName();
    public String accountEmail = FakeData.fakerFirstName() + "." + FakeData.fakerLastName() + "@yopmail.com";
    String createContactEmail = FakeData.fakerFirstName()+ FakeData.fakerLastName() + "@yopmail.com";
    String accountPhone = "(472) 505-1768";
    public String contactFN = "Bill";
    public String contactLN = "Williams";
    public String personalFirstName = FakeData.fakerFirstName();
    public String personalLastName = FakeData.fakerLastName();
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
    public String contactAddress = FakeData.address();
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

    String textInDetails328i = "2016 BMW 328i Runs and looks like new, Camera, Parking Sensors, etc. Comes with a free one month or 1000 miles Free Warranty! ";
    String textInDetailsM4 = "We prefer the 2020 M4 coupe versus its convertible counterpart, especially since it's $8500 cheaper. Likewise, the M4 CS may appeal to the most ardent BMW fans, but we don't think the marginal performance enhancements warrant its six-figure price tag";
    String textInDetails330e = "This 2017 BMW 3 Series 4dr 330e iPerformance Plug-In Hybrid features a 2.0L 4 CYLINDER 4cyl Hybrid engine. It is equipped with a 8 Speed Automatic transmission. The vehicle is Alpine White with a Black Leather interior. ";
    String textAdditionalDetails328i = "No accidents or damage reported to CARFAX";
    String textAdditionalDetails330e = "No accidents or damage reported to CARFAX";
    String textAdditionalDetailsM4 = "The EPA has different estimates between the M4's two body styles and transmission";
    String disclaimer = "Features and options are descriptive of what can be expected on the vehicle. Actual options should be verified by the customer and dealer. Plus government fees and taxes, any finance charges, any dealer document processing charge, any electronic filing charge, and any emission testing charge. Please contact dealer to confirm price and vehicle availability. Current mileage may vary due to test drives and vehicle relocation.";
    String descriptionOfItem1 = "2019 BMW 328I";
    String descriptionOfItem2 = "2020 BMW M4";
    String descriptionOfItem330e = "2016 BMW 328I";
    String estimatedValue328i = "47000";
    String estimatedValueM4 = "65000";
    String estimatedValue330e = "55000";
    String m4VinAudit = "Added [2020 BMW M4 WBS4Y9C0XLFJ49181 31507]";
    String itemAudit328i = "Added [2016 BMW 328I 31506]";
    String itemAudit330e = "Added [2014 BMW 330E 31519]";
    String vinNumber = "WBS4Y9C0XLFJ49181";
    CharSequence stockNumber = FakeData.random9DigitAccountNumber();
    CharSequence horsePower = FakeData.random3DigitNumber();
    CharSequence assetNumber = FakeData.random2DigitNumber();

    //Value Services Variables
    String quantity = "2";
    String markUp = "5";
    String cost = "100";
    String priceOfI = "$210.00";
    String valueServicesAudit = "Value Service Inspection Added";
    String valueServicesAuditDelete = "Value Service Storage Deleted";

    //Lien Variables
    String lienAddedAuditMessage = "Added Lien [Herman Group]";
    String contactName = "ESTEBAN HANE";
    String accountName = "HERMAN GROUP";
    String status = "PENDING UCC PULL";

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
    @FindBy(css = "[class='internal-notes']")
    public WebElement internalNotesSection;

    @FindBy(css = ".close > span")
    public WebElement xButtonOnMediaFile;
    //gear Icon
    @FindBy(xpath = "//a[contains(text(),' Add Note')]")
    public WebElement addNoteTab;

    @FindBy(css = ".btn-square.button-dropdown.dropbtn.nav")
    public WebElement gearIcon;

    //Upload Document - Modal
    @FindBy(xpath = "//a[contains(text(),' Upload Document')]")
    public WebElement uploadDocumentTab;
    @FindBy(id = "description")
    public WebElement descriptionTextBox;
    @FindBy(name = "documentType_ID")
    public WebElement documentTypeDropdown;
    @FindBy(css = ".card:nth-of-type(9) .table-responsive")
    public WebElement getDocumentTable;

    @FindBy(css = "[data-tip='Download'] [data-tip]")
    public WebElement documentsTrashIcon;

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

    @FindBy(css = ".d-inline")
    public WebElement getAccountName;

    //Action Menu
    @FindBy(xpath = "//a[contains(text(),' Toggle Account View')]")
    public WebElement toggleAccountView;

    @FindBy(xpath = "//a[contains(text(),' Location')]")
    public WebElement addLocationTab;

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
    @FindBy(xpath = "/html/body/div/div/div[@role='dialog']/div[@role='document']//form//div[@class='col-6 col-md-8']/div/div/div/div/div[.='Arnoldo West']")
    public WebElement firstContactName;

    @FindBy(xpath = "(//div[@class='col-padding col-12 col-sm-4 col-md-4 col-lg-3 col-xl-3'])[2]")
    public WebElement location2Card;

    //Buttons for modal pages
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[contains(text(),'Send')]")
    public WebElement sendButton;
    @FindBy(xpath = "//span[contains(text(),'Browse')]")
    public WebElement browseButton;
    @FindBy(xpath = "//button[contains(text(),'No')]")
    public WebElement noButton;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    public WebElement yesButton;

    //Accordion
    @FindBy(xpath = "(//i[@class='fa fa-plus fa-lg'])[2]")
    public WebElement documentsAccordion;


    @FindBy(css = "h5#locations > .fa.fa-lg.fa-plus")
    public WebElement locationsAccordionPlus;
    @FindBy(css = "h5#contact > .fa.fa-lg.fa-minus")
    public WebElement locationsAccordionMinus;

    //BACK OFFICE MENU
    @FindBy(xpath = "(//a[contains(text(),'Accounts')])[1]")
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
    public String internalNotesSectionValidation() {
        return internalNotesSection.getText();
    }

    public void searchForAccount() {
        accountsTab.click();
        BrowserUtils.waitFor(1);
        searchField.sendKeys(companyName);
        searchButton.click();
        BrowserUtils.waitFor(1);
        createdAccount.click();
        BrowserUtils.waitFor(2);
    }
    public void toggleToNormalAccountView() {
        BrowserUtils.waitFor(1);
        gearIcon.click();
        BrowserUtils.waitFor(3);
        toggleAccountView.click();
    }
    public void navigateToActionMenuFromNormalView() {
        toggleToNormalAccountView();
        BrowserUtils.waitFor(1);
        gearIcon.click();
    }
    public void navigateBetweenTabs(){
        Set<String> handles = driver.getWindowHandles();
        String firstWindowHandle = driver.getWindowHandle();
        System.out.println(firstWindowHandle);
        handles.remove(firstWindowHandle);
        String secondWindowHandle = handles.iterator().next();
        driver.switchTo().window(secondWindowHandle);
        BrowserUtils.waitFor(2);
        System.out.println(secondWindowHandle);
        BrowserUtils.waitFor(2);
    }
}

