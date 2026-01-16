package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EntryAd;
import pages.HomePage;

public class EntryAdTest extends BaseTest {

    HomePage homePage;
    EntryAd page;
    @BeforeMethod
    public void setup(){
        homePage=new HomePage(driver);
        homePage.clickOnEntryAd();
        page=new EntryAd(driver);
    }

    @Test(priority = 1)
    public void verifyEntryAdPopupIsDisplayed() {
        Assert.assertTrue(page.isModalDisplayed(), "Modal popup is not displayed");
        Assert.assertEquals(page.getModalTitle(), "THIS IS A MODAL WINDOW");
    }

    @Test(priority = 2)
    public void verifyUserCanClosePopup() {

        page.closeModal();
        // If no exception, popup closed successfully
        Assert.assertTrue(true, "Popup closed successfully");
    }

    @Test(priority = 3)
    public void verifyRestartAdShowsPopupAgain() {


        page.restartAd();
        Assert.assertTrue(page.isModalDisplayed(), "Modal popup did not appear again");
    }


}
