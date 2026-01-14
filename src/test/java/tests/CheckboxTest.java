package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.HomePage;

public class CheckboxTest extends BaseTest {

    private HomePage homePage;
    private CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void setup(){
        homePage=new HomePage(driver);
        homePage.clickOnCheckBoxLink();
        checkboxesPage=new CheckboxesPage(driver);

    }
    @Test
    public void checkHeading(){
        Assert.assertEquals(checkboxesPage.getHeadingText(),"Checkboxes");
    }

    @Test
    public void checkedFirstDisplayed(){
        Assert.assertTrue(checkboxesPage.firstCheckboxIsDisplayed());
    }

    @Test
    public void checkedsecondDisplayed(){
        Assert.assertTrue(checkboxesPage.secondCheckbox());
    }

    @Test
    public void secondCheckbox(){
        Assert.assertTrue(checkboxesPage.secondIsSelected());
    }

    @Test
    public void firstIsNotSelected(){
        Assert.assertFalse(checkboxesPage.firstNotSelected());
    }

}
