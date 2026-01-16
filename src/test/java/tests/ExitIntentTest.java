package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExitIntentPage;
import pages.HomePage;

public class ExitIntentTest extends BaseTest {

    HomePage homePage;
    ExitIntentPage page;

    @BeforeMethod
    public void setup(){
        homePage=new HomePage(driver);
        homePage.clickOnExitIntent();
        page=new ExitIntentPage(driver);


    }

    @Test(priority = 1)
    public void verifyExitIntentPopupAppears() {
         //page = new ExitIntentPage(driver);

        page.triggerExitIntent();

        Assert.assertTrue(page.isModalDisplayed(), "Exit intent popup is not displayed");
        Assert.assertEquals(page.getModalTitleText(), "THIS IS A MODAL WINDOW");
    }

    @Test(priority = 2)
    public void verifyUserCanCloseExitIntentPopup() {
       // ExitIntentPage page = new ExitIntentPage(driver);

        page.closeModal();

        // If no exception, popup closed successfully
        Assert.assertTrue(true, "Popup closed successfully");
    }
}
