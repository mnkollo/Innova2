package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;

import java.awt.*;
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
    public void AddItemToAPackageWithRequiredFields() {
        allPages.packagesPage().AddItemToAPackageWithRequiredFields();
    }
    @Test(priority = 23)
    public void TC_1067_VerifyUserCanUseVIN_DecodeWhenAddingItemToAPackage() {
        allPages.packagesPage().VIN_DecodeWhenAddingItemToAPackage();
    }
    @Test(priority = 24)
    public void TC_1065_AddItemToAPackageWithAllFields() {
        allPages.packagesPage().AddItemToAPackageWithAllFields();
        BrowserUtils.waitFor(1);
    }
    @Test(priority = 25)
    public void TC_1066_VerifyUserCanAddItemsToAPackageFromFile() throws IOException, AWTException {
        allPages.packagesPage().AddItemsToAPackageFromFile();
    }
    @Test(priority = 26)
    public void TC_7562_VerifyUserCanDeleteItemInAPackageInWorkingStatus() {
        allPages.packagesPage().deleteItemInAPackage();
        BrowserUtils.waitFor(2);
    }
    @Test(priority = 27)
    public void TC_7090_addNoteToAPackage(){
        allPages.packagesPage().addNotesToAPackage();
    }
    @Test(priority = 28)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackage(){
        allPages.packagesPage().addValueServiceToAPackage();
    }
    @Test(priority = 28)
    public void TC_7980_VerifyUserCanEditAddValueServiceToAPackage() {
        allPages.packagesPage().editValueServiceToAPackage();
    }
    @Test(priority = 29)
    public void TC_7079_VerifyUserCanRemoveValueServicesFromAPackage() {
        allPages.packagesPage().removeValueServicesFromAPackage();
    }
    @Test(priority = 30)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackageAgain(){
        allPages.packagesPage().addValueServiceToAPackage();
    }
    @Test(priority = 31)
    public void TC_2875_VerifyUserCanUploadDocumentToAPackage() throws IOException {
        allPages.packagesPage().uploadDocumentInPackage();
    }
    @Test(priority = 32)
    public void TC_1069_VerifyUserCanAddLienHolderToAPackage(){
        allPages.packagesPage().addLienHolderToAPackage();              //TODO finish this TC
    }

//    @Test(priority = 33)
//    public void TC_7098_VerifyUserCanDeleteDocumentsFromAPackage() throws IOException{
//        allPages.packagesPage().uploadDocumentInPackage();              //TODO finish this TC
//    }

}
