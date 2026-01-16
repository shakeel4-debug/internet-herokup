package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControls;
import pages.HomePage;

public class DynamicControlsTest extends BaseTest {

    HomePage homePage;
    DynamicControls page;

    @Test(priority = 1)
    public void verifyCheckboxRemoveAndAdd() {
        homePage=new HomePage(driver);
        homePage.clickOnDynamicControls();
         page = new DynamicControls(driver);

        // Remove checkbox
        page.clickRemoveAddButton();
        //Assert.assertEquals(page.getMessageText(), "It's gone!");
        Assert.assertFalse(page.isCheckboxPresent());

        // Add checkbox back
        page.clickRemoveAddButton();
        //Assert.assertEquals(page.getMessageText(), "It's back!");
        Assert.assertTrue(page.isCheckboxPresent());
    }

    @Test(priority = 2)
    public void verifyInputEnableAndDisable() {
        homePage=new HomePage(driver);
        homePage.clickOnDynamicControls();
         page = new DynamicControls(driver);

        // Enable input
        page.clickEnableDisableButton();
        Assert.assertEquals(page.getMessageText(), "It's enabled!");
        Assert.assertTrue(page.isInputEnabled());

        // Disable input
        page.clickEnableDisableButton();
        Assert.assertEquals(page.getMessageText(), "It's disabled!");
        Assert.assertFalse(page.isInputEnabled());
    }
}
