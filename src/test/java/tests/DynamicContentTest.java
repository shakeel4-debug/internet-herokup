package tests;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DynamicContentPage;
import pages.HomePage;

public class DynamicContentTest extends BaseTest {

    HomePage homePage;
    DynamicContentPage dynamicPage;

    @BeforeMethod
    public void setup() {
        homePage=new HomePage(driver);
        homePage.clickOnDynamicContent();
        dynamicPage = new DynamicContentPage(driver);

    }


    @Test
    public void verifyImagesAreDisplayed() {
        Assert.assertTrue(
                dynamicPage.getImageCount() >= 3,
                "Images are less than expected"
        );
    }

    @Test
    public void verifyTextBlocksAreDisplayed() {
        Assert.assertTrue(
                dynamicPage.getTextBlockCount() >= 3,
                "Text blocks are less than expected"
        );
    }

    @Test
    public void verifyImagesAreLoadedProperly() {
        Assert.assertTrue(
                dynamicPage.areImagesLoaded(),
                "One or more images are not loaded"
        );
    }

    @Test
    public void verifyContentChangesAfterRefresh() {
        String beforeRefresh = dynamicPage.getFirstTextBlock();
        dynamicPage.refreshPage();
        String afterRefresh = dynamicPage.getFirstTextBlock();

        Assert.assertNotEquals(
                beforeRefresh,
                afterRefresh,
                "Content did not change after refresh"
        );
    }
}

