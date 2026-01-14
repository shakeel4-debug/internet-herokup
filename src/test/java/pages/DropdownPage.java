package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    public DropdownPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h3")
    private WebElement heading;

    @FindBy(id="dropdown")
    private WebElement dropDown;



    public String getHeadingText(){
        return heading.getText();
    }

    public String getSelectedOption(){
        Select select=new Select(dropDown);
        return select.getFirstSelectedOption().getText();
    }
    public void selectOptionByText(String text){
        Select select=new Select(dropDown);
        select.selectByVisibleText(text);
    }
}
