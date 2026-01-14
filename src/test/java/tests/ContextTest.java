package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;

public class ContextTest extends BaseTest {

    @Test
    public void verifyContextMenuAlert(){
        HomePage homePage=new HomePage(driver);
        homePage.clickOnContextMenu();
        ContextMenuPage contextMenuPage=new ContextMenuPage(driver);
        Assert.assertEquals(contextMenuPage.getHeading(),"Context Menu");
        contextMenuPage.clickOnBox();
        Assert.assertEquals(contextMenuPage.getAlertText(),"You selected a context menu");
        contextMenuPage.acceptAlert();
    }
}
