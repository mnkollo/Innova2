package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;

public class PackagesTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 21)
    public void TC_3443_CreateConsignmentPackageFromAccountCOG() {
        allPages.accountsPage().createBusinessAccountAllData();
        allPages.accountsPage().searchForAccount();
        allPages.packagesPage().createAConsignmentPackage();
    }
    @Test(priority = 22)
    public void TC_1065_AddItemToAPackageWithRequiredFields() {                 //TODO finish this TC
        allPages.packagesPage().AddItemToAPackageWithRequiredFields();
    }
    @Test(priority = 22)
    public void TC_1067_VerifyUserCanUseVIN_DecodeWhenAddingItemToAPackage() {   //TODO finish this TC  Add Audit Section
        allPages.packagesPage().VIN_DecodeWhenAddingItemToAPackage();
        BrowserUtils.waitFor(3);
    }
}
