package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagePage {
    WebDriver driver;
    public BrokenImagePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="h3")
    private WebElement heading;

    public String getHeadingText(){
        return heading.getText();
    }




}
