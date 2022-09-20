package regressionTest;

import org.testng.annotations.*;
import utilities.AllPages;
import utilities.InnovaTestBase;

public class End2EndScenarios extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 20)
    public void CreateAccount_ApplyDeposit_RefundDeposit_CompletePaymentRequest() {
        //Create Account
        allPages.accountsPage().createBusinessAccountAllData();
        allPages.accountsPage().editAccount();
        //Apply Deposit
        allPages.accountsPage().applyDepositByCashToAccountPage();
        //ReFund Deposit
        allPages.accountsPage().verifyUserCanRefundDepositFromAccountPage();
        //Work Order Board
        allPages.workOrderBoard().createdPaymentRequest();
    }

}

