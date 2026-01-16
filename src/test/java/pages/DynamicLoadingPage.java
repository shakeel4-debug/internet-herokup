package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Example 1: Element on page that is hidden")
    private WebElement example1Link;

    @FindBy(linkText = "Example 2: Element rendered after the fact")
    private WebElement example2Link;

    public void openExample1() {
        example1Link.click();
    }

    public void openExample2() {
        example2Link.click();
    }
}
