package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".heading")
    private WebElement heading;

    @FindBy(linkText = "A/B Testing")
    private WebElement abTestingLink;

    @FindBy(linkText = "Add/Remove Elements")
    private WebElement addRemoveLink;

    @FindBy(xpath = "//a[text()='Broken Images']")
    private WebElement brokenImageLink;

    @FindBy(xpath = "//a[text()='Challenging DOM']")
    private WebElement challengeLink;

    @FindBy (linkText = "Checkboxes")
    private WebElement checkboxLink;

    @FindBy(linkText = "Context Menu")
    private WebElement contextMenuLink;

    @FindBy(linkText = "Disappearing Elements")
    private WebElement disappearingElements;

    @FindBy (linkText = "Drag and Drop")
    private WebElement dragAndDrop;

    @FindBy (linkText = "Dropdown")
    private WebElement dropDown;

    @FindBy(linkText = "Dynamic Content")
    private WebElement dynamicContent;

    @FindBy(linkText = "Dynamic Controls")
    private WebElement dynamicControl;

    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoading;

    @FindBy(linkText = "Entry Ad")
    private WebElement entryAd;

    @FindBy(linkText = "Exit Intent")
    private WebElement exitIntent;

    public void clickOnDynamicContent(){
        dynamicContent.click();
    }

    public void clickOnDynamicControls(){
        dynamicControl.click();
    }

    public void clickOndynamicLoading(){
        dynamicLoading.click();
    }

    public void clickOnEntryAd(){
        entryAd.click();
    }

    public void clickOnExitIntent(){
        exitIntent.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getHeadingText() {
        return heading.getText();
    }

    public void clickABTesting() {
        abTestingLink.click();
    }

    public void clickChallengingDom(){
        challengeLink.click();
    }

    public void clickAddRemoveLink(){
        addRemoveLink.click();
    }

    public void clickOnBrokenImageLink(){
        brokenImageLink.click();
    }

    public void clickOnCheckBoxLink(){
        checkboxLink.click();
    }

    public void clickOnContextMenu(){
        contextMenuLink.click();
    }

    public void clickOnDisappearingElement(){
        disappearingElements.click();
    }
    public void clickOnDrageAndDrop(){
        dragAndDrop.click();
    }

    public void clickOnDropDown(){
        dropDown.click();
    }

}
