package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.AllPages;
import utilities.Driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AllPages allPages = new AllPages();
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


    //Methods
    public String loginSuccess() {
        return dashboardNotConfiguredMessage.getText();
    }
    public void loginSuccessfully(){
        Assert.assertTrue(loginSuccess().contains(successMessage));
    }
}

