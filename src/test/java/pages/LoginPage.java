package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //ELEMENTS
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButton;
    @FindBy(xpath = "//h3[contains(text(),'Student Information System')]")
    public WebElement systemName;
    @FindBy(xpath = "//div[contains(text(),'Michael Nkollo (OM)')]")
    public WebElement chooseMichaelNkolloOM;
    @FindBy(xpath = "//div[contains(text(),'Michael Nkollo (SU)')]")
    public WebElement chooseMichaelNkolloSU;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div/div[1]/div/form/div[3]")
    public WebElement systemUserDropdown;


    public void login(){
        username.sendKeys(ConfigurationReader.getUsername());
        password.sendKeys(ConfigurationReader.getPassword());
        loginButton.click();
        systemUserDropdown.click();
        BrowserUtils.waitFor(1);
        chooseMichaelNkolloSU.click();
        loginButton.click();
    }
    public String getSystemName(){
        return systemName.getText();
    }
}

