package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExitIntentPage {

    WebDriver driver;
    WebDriverWait wait;

    public ExitIntentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

    // Locators
    private By modalWindow = By.id("ouibounce-modal");
    private By modalTitle = By.xpath("//div[@class='modal-title']/h3");
    private By closeButton = By.xpath("//div[@class='modal-footer']/p");

    // Actions
    public void triggerExitIntent() {
        Actions actions = new Actions(driver);
        actions.moveByOffset(0, 0).perform();   // move mouse to top
    }

    public boolean isModalDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow)).isDisplayed();
    }

    public String getModalTitleText() {
        return driver.findElement(modalTitle).getText();
    }

    public void closeModal() {
        driver.findElement(closeButton).click();
    }
}
