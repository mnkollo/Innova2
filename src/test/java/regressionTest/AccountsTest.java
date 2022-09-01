package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.InnovaTestBase;

public class AccountsTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 1)
    public void VerifyUserCanLoginSuccessfully() {
        allPages.basePage().loginSuccessfully();
    }

    @Test(priority = 2)
    public void VerifyUserCanCreateBusinessAccountWithAllFields() {
        allPages.accountsPage().createBusinessAccountAllData();
    }

    @Test(priority = 3, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1052_VerifyCreatedAccountHasCorrectDataOnDashboard() {
        allPages.accountsPage().accountCreatedDashboard();
    }

    @Test(priority = 4)
    public void TC_3678_VerifyUserCanCreatePersonalAccount() {
        allPages.accountsPage().createPersonalAccount();

    }

    @Test(priority = 5, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")                             //TODO add search method instead of the search method steps
    public void TC_3425_VerifyUserCanEditAccount() {
        allPages.accountsPage().editAccount();
    }

    //Actions With Account

    @Test(priority = 6,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1058_VerifyUserCanAddAdditionalContact() {
        allPages.accountsPage().createContact();
    }

    @Test(priority = 7, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1113_VerifyUserCanAddBankAccountToAccount() {
        allPages.accountsPage().addBankAccount();
    }

    @Test(priority = 8, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1054_VerifyUserCanCreateSalesAgreementOnNewAccount() {
        allPages.accountsPage().createSalesAgreement();
    }
    @Test(priority = 9,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1247_VerifyUserCanCreateNewSalesAgreementOnExistingAccount() {
        allPages.accountsPage().createSalesAgreementOnExistingSalesAgreement();
    }
    @Test(priority = 10,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1060_VerifyUserCanAddLocationToAccount() {
        allPages.accountsPage().addLocationToAnAccount();
        allPages.accountsPage().verifyNewLocationAddedToAccount();
    }
    @Test(priority = 11,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_3430_VerifyUserCanAddNoteOnAccountPage(){
        allPages.accountsPage().addNoteToAnAccount();
        allPages.accountsPage().VerifyNoteIsAdded();
    }
    @Test(priority = 12)
    public void TC_3476_VerifyAbleToAddCollectionsNoteOnAccountPage() {
        allPages.accountsPage().AddCollectionsNoteOnAccountPage();
        allPages.accountsPage().VerifyCollectionsNoteOnAccountPage();
    }
//    @Test(priority = 13)
//    public void TC_3486_VerifyUserCanUploadDocumentOnAccountPage() throws IOException {      //TODO I need to work on this TC
//        allPages.accountsPage().uploadDocumentOnAccountPage();
//    }
    @Test(priority = 14)
    public void TC_2764_VerifyUserCanApplyDepositByWireTransferToAccountPage(){
        allPages.accountsPage().applyDepositByWireTransferToAccountPage();
    }
    @Test(priority = 15)
    public void TC_2764_VerifyUserCanApplyDepositByMoneyOrderToAccountPage(){
        allPages.accountsPage().applyDepositByMoneyOrderToAccountPage();
    }
    @Test(priority = 16)
    public void TC_3482_VerifyUserCanApplyDepositByMoneyOrderToAccountPage(){
        allPages.accountsPage().applyDepositByACHToAccountPage();
    }
    @Test(priority = 17)
    public void TC_3483_VerifyUserCanApplyDepositByCheckToAccountPage(){
        allPages.accountsPage().applyDepositByCheckToAccountPage();
    }
    @Test(priority = 18)
    public void TC_3484_VerifyUserCanApplyDepositByCashToAccountPage(){
        allPages.accountsPage().applyDepositByCashToAccountPage();
    }
    @Test(priority = 19)
    public void TC_2760_VerifyUserCanApplyDepositByCreditCardToAccountPage(){
        allPages.accountsPage().applyDepositByCreditCardToAccountPage();
    }
    @Test(priority = 19)
    public void TC_3119_VerifyUserCanRefundDepositFromAccountPage(){
        allPages.accountsPage().verifyUserCanRefundDepositFromAccountPage();
    }
}

