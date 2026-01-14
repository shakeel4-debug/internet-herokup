package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class ContextMenuPage {
    WebDriver driver;
    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div.example h3")
    private WebElement heading;

    @FindBy(id="hot-spot")
    private WebElement box;

    public String getHeading(){
        return heading.getText();
    }

    public void clickOnBox(){
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();
    }

    public String getAlertText(){
        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


}
