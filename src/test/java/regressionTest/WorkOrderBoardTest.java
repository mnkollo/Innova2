package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.InnovaTestBase;

public class WorkOrderBoardTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 62)
    public void TC_1809_Backoffice_VerifyOfferDisplaysOnWorkOrderBoard () {
        allPages.workOrderBoard().offerDisplaysOnWorkOrderBoard();
    }
    @Test(priority = 63)
    public void TC_3473_Backoffice_VerifyAbleToAcceptOfferFromWorkOrderBoard () {
        allPages.workOrderBoard().acceptOfferFromWorkOrderBoard();
    }
}
