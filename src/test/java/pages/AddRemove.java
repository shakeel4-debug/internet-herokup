package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemove{
    WebDriver driver;
    public AddRemove(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h3")
    private WebElement pageHeading;

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElement;

    @FindBy(xpath = "//button[text()='Delete']")
    private List<WebElement> deleteButton;

    public String getHeadingText(){
        return pageHeading.getText();
    }

    public void clickOnAddElementButton(){
        addElement.click();
    }

    public void clickOnFirstDeleteButton(){
        if (!deleteButton.isEmpty())
            deleteButton.get(0).click();
    }
    public void clickasDeleteLastButton(){
        if (!deleteButton.isEmpty())
            deleteButton.get(deleteButton.size()-1).click();
    }

    public void clickAllDeleteButton(){
        while (!deleteButton.isEmpty()){
            deleteButton.get(0).click();
        }
    }

    public int getDeleteButtonCount(){
        return deleteButton.size();
    }

    public boolean checkDeleteButtonIsDisplayed(){
        return !deleteButton.isEmpty();
    }

}
