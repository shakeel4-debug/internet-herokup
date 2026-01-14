package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BrokenImagePage;
import pages.HomePage;

import java.util.HashMap;

public class BrokenImageTest extends BaseTest {
    private HomePage homePage;
    private BrokenImagePage brokenImagePage;

    @BeforeMethod
    public void setup(){
        homePage=new HomePage(driver);
        homePage.clickOnBrokenImageLink();
        brokenImagePage=new BrokenImagePage(driver);
    }

    @Test
    public void validateHeadingText(){
        Assert.assertEquals(brokenImagePage.getHeadingText(),"Broken Images");
    }
}
