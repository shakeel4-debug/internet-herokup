package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAd {

    WebDriver driver;
    WebDriverWait wait;
    public EntryAd(WebDriver driver){
        this.driver=driver;
        //PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



// Locators
private By modalWindow = By.id("modal");
private By modalTitle = By.xpath("//div[@class='modal-title']//h3");
private By closeButton = By.xpath("//div[@class='modal-footer']/p");
private By restartAdLink = By.id("restart-ad");

// Actions
public boolean isModalDisplayed() {
    return wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow)).isDisplayed();
}

public String getModalTitle() {
    return driver.findElement(modalTitle).getText();
}

public void closeModal() {
    driver.findElement(closeButton).click();
}

public void restartAd() {
    driver.findElement(restartAdLink).click();
}



}
