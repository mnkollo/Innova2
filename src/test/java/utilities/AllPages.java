package utilities;
import org.jsoup.Connection;
import pages.*;

public class AllPages {
    private pages.LoginPage loginPage;
    private AccountsPage accountsPage;
    private BasePage basePage;

    public pages.LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public AccountsPage accountsPage() {
        if (accountsPage == null) {
            accountsPage = new AccountsPage();
        }
        return accountsPage;
    }
    public BasePage basePage() {
        if (basePage == null) {
            basePage = new BasePage();
        }
        return basePage;
    }
}
