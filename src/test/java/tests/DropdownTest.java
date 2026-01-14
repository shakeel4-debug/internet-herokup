package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;

public class DropdownTest extends BaseTest {

    @Test
    public void checkDropDown(){
        HomePage homePage=new HomePage(driver);
        homePage.clickOnDropDown();
        DropdownPage dropdownPage=new DropdownPage(driver);
        Assert.assertEquals(dropdownPage.getHeadingText(),"Dropdown List");
        //Assert.assertEquals(dropdownPage.getSelectedOption(),"Please select an option");

        dropdownPage.selectOptionByText("Option 1");
        Assert.assertEquals(dropdownPage.getSelectedOption(),"Option 1");
        dropdownPage.selectOptionByText("Option 2");
        Assert.assertEquals(dropdownPage.getSelectedOption(),"Option 2");
    }
}
