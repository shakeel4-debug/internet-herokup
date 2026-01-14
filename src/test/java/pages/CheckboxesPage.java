package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {

    WebDriver driver;
    public CheckboxesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="div.example h3")
    private WebElement heading;

    @FindBy (xpath = "//input[@type='checkbox'][1]")
    private WebElement firstCheckbox;

    @FindBy (xpath = "//input[@type='checkbox'][2]")
    private WebElement secondCheckbox;

    public String getHeadingText(){
        return heading.getText();
    }

    public boolean firstCheckboxIsDisplayed(){
        return firstCheckbox.isDisplayed();
    }

    public boolean secondCheckbox(){
        return secondCheckbox.isDisplayed();
    }

    public boolean secondIsSelected(){
        return secondCheckbox.isSelected();
    }

    public boolean firstNotSelected(){
        return firstCheckbox.isSelected();
    }

}
