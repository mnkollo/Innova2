package regressionTest;

import io.qameta.allure.*;
import org.testng.annotations.*;
import utilities.AllPages;
import utilities.InnovaTestBase;

public class End2End extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 20, description = "CreateAccount_ApplyDeposit_RefundDeposit_CompletePaymentRequest")
    @Severity(SeverityLevel.NORMAL)
    @Description("Description: CreateAccount_ApplyDeposit_RefundDeposit_CompletePaymentRequest")
    @Story("Story Name: Check title")
    @Step("Step: Create Account")
    public void CreateAccount_ApplyDeposit_RefundDeposit_CompletePaymentRequest() {
        //Create Account
        allPages.accountsPage().createBusinessAccountAllData();
        //Apply Deposit
        allPages.accountsPage().applyDepositByCashToAccountPage();
        //ReFund Deposit
        allPages.accountsPage().verifyUserCanRefundDepositFromAccountPage();    //TODO Need to finish the end to end scenario
        //Work Order Board
        allPages.workOrderBoard().createdPaymentRequest();
    }

}

