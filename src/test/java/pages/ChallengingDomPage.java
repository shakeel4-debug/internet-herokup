package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage {

    WebDriver driver;
    public ChallengingDomPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "div.example h3")
    private WebElement heading;

    @FindBy(css = "table tbody tr")
    private List<WebElement> tableRow;

    @FindBy(xpath = "//a[text()='edit']")
    private List<WebElement> editLinks;

    @FindBy(xpath = "//a[text()='delete']")
    private List<WebElement> deleteLinks;

    public int getRowCount(){
        return tableRow.size();
    }

    public void clickEditOnRow(int index)
    {
        editLinks.get(index).click();
    }


    public void clickOnDeleteRow(int index){
        deleteLinks.get(index).click();
    }






    public String getHeadingText(){
        return heading.getText();
    }


}
