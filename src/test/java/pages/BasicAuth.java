package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuth {

    WebDriver driver;

    public BasicAuth(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
