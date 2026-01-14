package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
    WebDriver driver;
    public DragAndDropPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="div.example h3")
    private WebElement heading;

    @FindBy (id="column-a")
    private WebElement cloumna;

    @FindBy (id="column-b")
    private WebElement cloumnb;

    public String clickOnHeading(){
        return heading.getText();
    }

    public String getColumnAText(){
        return cloumna.getText();
    }

    public String getColumnBText(){
        return cloumnb.getText();
    }

    public void dragAtoB(){
        Actions actions=new Actions(driver);
        actions.dragAndDrop(cloumna,cloumnb);
    }


}
