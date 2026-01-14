package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChallengingDomPage;
import pages.HomePage;

public class ChallengingDom extends BaseTest {

    @Test
    public void Run(){
        HomePage homePage=new HomePage(driver);
        homePage.clickChallengingDom();
        ChallengingDomPage challengingDomPage=new ChallengingDomPage(driver);
        String currentText=challengingDomPage.getHeadingText();
        Assert.assertEquals(currentText,"Challenging DOM");
        int length=challengingDomPage.getRowCount();
        System.out.println(length);
        challengingDomPage.clickOnDeleteRow(1);
        Assert.assertTrue(challengingDomPage.getRowCount()>0);

    }
}
