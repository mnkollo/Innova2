package utilities;
import pages.*;

public class AllPages {
    private pages.LoginPage loginPage;
    private AccountsPage accountsPage;
    private BasePage basePage;
    private WorkOrderBoard workOrderBoard;
    private PackagesPage packagesPage;

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
    public WorkOrderBoard workOrderBoard() {
        if (workOrderBoard == null) {
            workOrderBoard = new WorkOrderBoard();
        }
        return workOrderBoard;
    }
    public PackagesPage packagesPage() {
        if (packagesPage == null) {
            packagesPage = new PackagesPage();
        }
        return packagesPage;
    }
}
