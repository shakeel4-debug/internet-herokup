package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisappearingElements {
    WebDriver driver;
    public DisappearingElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div.example h3")
    private WebElement heading;

    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "About")
    private WebElement aboutLink;

    @FindBy(tagName = "h1")
    private WebElement notFound;

    public String getHeading(){
        return heading.getText();
    }

    public void clickOnHomeLink(){
        homeLink.click();
    }

    public void clickOnAbout(){
        aboutLink.click();
    }

    public String getNotFoundText(){
        return notFound.getText();
    }


}
