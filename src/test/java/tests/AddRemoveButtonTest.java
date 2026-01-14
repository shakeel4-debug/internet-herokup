package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddRemove;
import pages.HomePage;

public class AddRemoveButtonTest extends BaseTest {

    private HomePage homePage;
    private AddRemove addRemove;

    @BeforeMethod
    public void setUpPage() {
        homePage = new HomePage(driver);
        homePage.clickAddRemoveLink();

        addRemove = new AddRemove(driver);
        Assert.assertEquals(addRemove.getHeadingText(), "Add/Remove Elements");
    }

    @Test
    public void validatePageHeading() {
        // Heading already validated in @BeforeMethod
    }

    @Test
    public void validateDeleteButtonIsNotDisplayedByDefault() {
        addRemove.clickOnAddElementButton();
        Assert.assertEquals(addRemove.getDeleteButtonCount(),1);
        addRemove.clickOnFirstDeleteButton();
        Assert.assertEquals(addRemove.getDeleteButtonCount(),0);
    }

    @Test
    public void validateHappyFlow() {
        addRemove.clickOnAddElementButton();
        Assert.assertTrue(addRemove.checkDeleteButtonIsDisplayed(),
                "Delete button should be visible after adding element");
    }

    @Test
    public void validateCreatedMultipleAndRemovedLastOne() {
        addRemove.clickOnAddElementButton();
        addRemove.clickOnAddElementButton();
        addRemove.clickOnAddElementButton();
        Assert.assertEquals(addRemove.getDeleteButtonCount(),3);
        addRemove.clickasDeleteLastButton();
        Assert.assertEquals(addRemove.getDeleteButtonCount(),2);
    }
}


