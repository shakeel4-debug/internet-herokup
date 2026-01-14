package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTestPage {

    WebDriver driver;

    public ABTestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.example h3")
    private WebElement pageHeading;

    @FindBy(css = "div.example p")
    private WebElement paragraphText;

    public String getPageHeading() {
        return pageHeading.getText();
    }

    public String getParagraphText() {
        return paragraphText.getText().trim();
    }
}
