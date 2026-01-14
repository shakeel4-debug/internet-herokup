package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

public class DragAndDropTest extends BaseTest {
    @Test
    public void validateDragAndDrop(){
        HomePage homePage=new HomePage(driver);
        homePage.clickOnDrageAndDrop();
        DragAndDropPage dragAndDropPage=new DragAndDropPage(driver);
        Assert.assertEquals(dragAndDropPage.clickOnHeading(),"Drag and Drop");
        Assert.assertEquals(dragAndDropPage.getColumnAText(),"A");
        Assert.assertEquals(dragAndDropPage.getColumnBText(),"B");
        dragAndDropPage.dragAtoB();
        Assert.assertEquals(dragAndDropPage.getColumnAText(),"A");
        Assert.assertEquals(dragAndDropPage.getColumnBText(),"B");
    }
}
