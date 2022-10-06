package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;
import java.io.IOException;

public class PackagesTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    // ***************************************** Actions with Package In Working Status ****************************************************************
    @Test(priority = 22)
    public void TC_3443_CreateConsignmentPackageFromAccountCOG() {
        allPages.packagesPage().createBusinessAccountAllDataPackage();
        allPages.packagesPage().searchForAccountPackage();
        allPages.packagesPage().createAConsignmentPackage();
    }

    @Test(priority = 23)
    public void AddItemToAPackageWithRequiredFields() {
        allPages.packagesPage().AddItemToAPackageWithRequiredFields();
    }

    @Test(priority = 24)
    public void TC_1067_VerifyUserCanUseVIN_DecodeWhenAddingItemToAPackage() {
        allPages.packagesPage().VIN_DecodeWhenAddingItemToAPackage();
    }

    @Test(priority = 25)
    public void TC_1065_AddItemToAPackageWithAllFields() {
        allPages.packagesPage().AddItemToAPackageWithAllFields();
        BrowserUtils.waitFor(1);
    }

    @Test(priority = 26)
    public void TC_1066_VerifyUserCanAddItemsToAPackageFromFile() throws IOException {
        allPages.packagesPage().AddItemsToAPackageFromFile();
    }

    @Test(priority = 27)
    public void TC_7562_VerifyUserCanDeleteItemInAPackageInWorkingStatus() {
        allPages.packagesPage().deleteItemInAPackage();
        BrowserUtils.waitFor(2);
    }
    @Test(priority = 28)
    public void TC_VerifyUserCanAddLoadOutInstructions() {
        allPages.packagesPage().addLoadOutInstructions();
        //allPages.accountsPage().verifyNewLocationAddedToAccount();
    }

    @Test(priority = 29)
    public void TC_7090_addNoteToAPackage() {
        allPages.packagesPage().addNotesToAPackage();
    }

    @Test(priority = 30)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackage() {
        allPages.packagesPage().addValueServiceToAPackage();
    }

    @Test(priority = 31)
    public void TC_7980_VerifyUserCanEditAddValueServiceToAPackage() {
        allPages.packagesPage().editValueServiceToAPackage();
    }

    @Test(priority = 32)
    public void TC_7079_VerifyUserCanRemoveValueServicesFromAPackage() {
        allPages.packagesPage().removeValueServicesFromAPackage();
    }

    @Test(priority = 33)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackageAgain() {
        allPages.packagesPage().addValueServiceToAPackage();
    }

    @Test(priority = 34)
    public void TC_2875_VerifyUserCanUploadDocumentToAPackage() throws IOException {
        allPages.packagesPage().searchForAccountInPackages();
        allPages.packagesPage().uploadDocumentInPackage();
    }

    @Test(priority = 35)
    public void TC_7098_VerifyUserCanDeleteDocumentsFromAPackage() {
        allPages.packagesPage().deleteDocumentInPackage();

    }

    @Test(priority = 36)
    public void TC_1069_VerifyUserCanAddLienHolderToAPackage() {
        allPages.packagesPage().addLienHolderToAPackage();
    }

    @Test(priority = 37)
    public void TC_6385_VerifyUserCanChangeStatusForLienHolder_ExceptLetterReceived() {
        allPages.packagesPage().changeLienStatus();                           //TODO finish this TC
    }

    @Test(priority = 38)
    public void TC_7121_VerifyUserCanCreateSalesAgreementFromAPackage() {
        allPages.packagesPage().createSalesAgreementFromAPackage();
    }

    @Test(priority = 39)
    public void TC_7178_VerifyUserCanRequestInspectionFromPackage(){
        allPages.packagesPage().requestInspectionFromPackage();    //TODO Finish TC
    }
    @Test(priority = 40)
    public void TC_3468_VerifyUserCanAddMediaFileOnItemPage() throws IOException {
        allPages.packagesPage().addMediaFileToAnItem();
    }
    @Test(priority = 41)
    public void TC_7487_VerifyUserCanMovePackageToPendingContractStatus() {
        allPages.packagesPage().movePackageToPendingContractStatus();
    }
    @Test(priority = 42)
    public void TC_3447_VerifyUserCanMovePackageToContractOutStatus() {
        allPages.packagesPage().movePackageToContractOutStatus();
    }
    @Test(priority = 43)
    public void TC_1752_VerifyUserCanMovePackageToContractInStatus() {
        allPages.packagesPage().movePackageToContractInStatus();
    }
    @Test(priority = 44)
    public void TC_1752_VerifyUserCanMovePackageToWonStatus() {
        allPages.packagesPage().movePackageToWonStatus();
    }
    @Test(priority = 45)
    public void TC_1765_VerifyUserCanVerifyTitleIconForItem() {
        allPages.packagesPage().verifyTitleIconForItem();
    }
    @Test(priority = 46)
    public void TC_1766_VerifyUserCanVerifyLienIconForItem() {
        allPages.packagesPage().verifyLienIconForItem();
    }
    @Test(priority = 47)
    public void TC_1766_VerifyUserCanVerifyLocationIconForItem() {
        allPages.packagesPage().verifyLocationIconForItem();
    }

    @Test(priority = 48)
    public void TC_1768_VerifyUserCanVerifyInspectionIconForItem() {
        allPages.packagesPage().verifyInspectionIconForItem();
    }
    @Test(priority = 49)
    public void TC_1766_VerifyUserCanVerifyDetailsIconForItem() {
        allPages.packagesPage().verifyDetailsIconForItem();
    }
    @Test(priority = 50)
    public void TC_1770_VerifyUserCanVerifyValueServicesIconForItem() {
        allPages.packagesPage().verifyValueServiceIconForItem();
    }
    @Test(priority = 51)
    public void TC_1771_VerifyUserCanVerifyEventIconForItem() {
        allPages.packagesPage().verifyEventIconForItem();
    }
    @Test(priority = 52)
    public void TC_1771_VerifyUserCanVerifyPriceIconForItem() {
        allPages.packagesPage().verifyPriceIconForItem();
    }
    @Test(priority = 53)
    public void TC_1773_VerifyUserCanVerifyQCIconForItem(){
        allPages.packagesPage().verifyQCIconForItem();
    }
    @Test(priority = 54)
    public void TC_1774_VerifyUserCanVerifyGoOnlineIconForItem() {
        allPages.packagesPage().verifyGoOnlineIconForItem();
    }
    @Test(priority = 55)
    public void TC_7273_VerifyUserCanAddNoteToAnItem() {
        allPages.packagesPage().addNoteToItem();
    }
    @Test(priority = 56)
    public void TC_1771_VerifyAfterVerificationStepsToPostItemOnlineItemVisibleOnAuctionSite() {
        allPages.packagesPage().OnlineItemVisibleOnAuctionSite();
    }
//    @Test(priority = 56)
//    public void TC_7917_VerifyLoadOutInstructionsOnAuctionSite() {          //TODO working on this now
//        allPages.packagesPage().sellItemFromBackOffice();
//    }
//    @Test(priority = 57)
//    public void TC_7917_VerifyPreviewHoursInstructionsOnAuctionSite() {          //TODO working on this now
//    }

        // **************************************Actions with Open Package *****************************************************************
    @Test(priority = 59)
    public void TC_1286_OpenPackagesPage() {
        allPages.packagesPage().searchForAccountPackage();
        allPages.accountsPage().createOpenPackage();
    }

}
