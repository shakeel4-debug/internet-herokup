package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.DynamicLoadingPage;
import pages.ExamplePage;
import pages.HomePage;

public class DynamicLoadingTest extends BaseTest {

    HomePage homePage;
    DynamicLoadingPage dynamicLoadingPage;

    @Test(priority = 1)
    public void verifyExample1DynamicLoading() {
        homePage=new HomePage(driver);
        homePage.clickOndynamicLoading();
        dynamicLoadingPage= new DynamicLoadingPage(driver);
        dynamicLoadingPage.openExample1();

        ExamplePage examplePage = new ExamplePage(driver);
        examplePage.clickStart();

        Assert.assertEquals(examplePage.getFinishText(), "Hello World!");
    }

    @Test(priority = 2)
    public void verifyExample2DynamicLoading() {

        homePage=new HomePage(driver);
        homePage.clickOndynamicLoading();
        dynamicLoadingPage= new DynamicLoadingPage(driver);
        dynamicLoadingPage.openExample1();

        ExamplePage examplePage = new ExamplePage(driver);
        examplePage.clickStart();

        Assert.assertEquals(examplePage.getFinishText(), "Hello World!");
    }
}
