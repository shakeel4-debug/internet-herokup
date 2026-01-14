package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DisappearingElements;
import pages.HomePage;

public class DisappearingElementsTest extends BaseTest {
    @Test
    public void checkLinks(){
        HomePage homePage=new HomePage(driver);
        homePage.clickOnDisappearingElement();
        DisappearingElements disappearingElements=new DisappearingElements(driver);
        disappearingElements.clickOnHomeLink();
        homePage.clickOnDisappearingElement();
        disappearingElements.clickOnAbout();
        Assert.assertEquals(disappearingElements.getNotFoundText(),"Not Found");

    }
}
