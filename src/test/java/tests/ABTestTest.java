package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTestPage;
import pages.HomePage;

public class ABTestTest extends BaseTest {

    @Test
    public void verifyABTestingPage() {

        HomePage homePage = new HomePage(driver);

        Assert.assertEquals(homePage.getPageTitle(), "The Internet");
        Assert.assertEquals(homePage.getHeadingText(), "Welcome to the-internet");

        homePage.clickABTesting();

        ABTestPage abTestPage = new ABTestPage(driver);

        Assert.assertTrue(abTestPage.getPageHeading().contains("A/B Test"));

        String expectedParagraph =
                "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";

        Assert.assertEquals(abTestPage.getParagraphText(), expectedParagraph);
    }
}

