package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DynamicContentPage {
    WebDriver driver;
    public DynamicContentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".example img")
    private List<WebElement> images;

    @FindBy(css=".large.10.columns")
    private List<WebElement> textBlocks;

    public int getImageCount(){
        return images.size();
    }

    public int getTextBlockCount(){
        return textBlocks.size();
    }

    public boolean areImagesLoaded() {
        for (WebElement img : images) {
            String src=img.getAttribute("src");
            if (src==null||src.isEmpty()){
                return false;
            }
        }
        return true;
    }

    public String getFirstTextBlock(){
        return textBlocks.get(0).getText();
    }

    public void refreshPage(){
    driver.navigate().refresh();
    }



}
