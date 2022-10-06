package utilities;
import pages.*;
public class AllPages {
    private LoginPage loginPage;
    private AccountsPage accountsPage;
    private BasePage basePage;
    private WorkOrderBoard workOrderBoard;
    private PackagesPage packagesPage;
    private AuctionItemPage auctionItemPage;

    public LoginPage loginPage() {
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
    public AuctionItemPage auctionItemPage() {
        if (auctionItemPage == null) {
            auctionItemPage = new AuctionItemPage();
        }
        return auctionItemPage;
    }
}
