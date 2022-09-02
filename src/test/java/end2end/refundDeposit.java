package end2end;

import org.testng.annotations.Test;
import pages.WorkOrderBoard;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;

public class refundDeposit extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 1)
    public void CreateAccount_ApplyDeposit_RefundDeposit_CompletePaymentRequest() {
        //Apply Deposit
        allPages.accountsPage().verifyUserCanRefundDepositFromAccountPage();    //TODO Need to finish the end to end scenario
        //Refund Deposit
        allPages.workOrderBoard().createdPaymentRequest();
    }

}
