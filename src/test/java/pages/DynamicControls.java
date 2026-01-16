package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DynamicControls {

    WebDriver driver;
    public DynamicControls(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> checkbox;

   @FindBy(xpath = "//form[@id='checkbox-example']//button")
   WebElement removeAddButton;

  @FindBy(id="message")
  private WebElement message;

  @FindBy(xpath = "//form[@id='input-example']//button")
  private WebElement enableDisableButton;

  @FindBy(xpath = "//form[@id='input-example']//input")
    private WebElement inputField;

    // Actions
    public void clickRemoveAddButton() {
        removeAddButton.click();
    }

    public boolean isCheckboxPresent() {
        return checkbox.size() > 0;
    }

    public String getMessageText() {
      return message.getText();
    }

    public void clickEnableDisableButton() {
        enableDisableButton.click();
    }

    public boolean isInputEnabled() {
//        WebElement input = driver.findElement(inputField);
        return inputField.isEnabled();
    }
}
