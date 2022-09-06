package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;

import java.io.IOException;

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
    @Test(priority = 23)
    public void TC_1067_VerifyUserCanUseVIN_DecodeWhenAddingItemToAPackage() {   //TODO finish this TC  Add Audit Section
        allPages.packagesPage().VIN_DecodeWhenAddingItemToAPackage();
    }
    @Test(priority = 24)
    public void TC_1065_AddItemToAPackageWithAllFields() {
        allPages.packagesPage().AddItemToAPackageWithAllFields();
        BrowserUtils.waitFor(1);
    }
    @Test(priority = 25)
    public void TC_1066_VerifyUserCanAddItemsToAPackageFromFile() throws IOException {
        allPages.packagesPage().AddItemsToAPackageFromFile();
    }
    @Test(priority = 26)
    public void TC_7562_VerifyUserCanDeleteItemInAPackageInWorkingStatus() {
        allPages.packagesPage().deleteItemInAPackage();
        BrowserUtils.waitFor(2);
    }
    @Test(priority = 27)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackage(){                           //TODO finish this TC

    }

}
