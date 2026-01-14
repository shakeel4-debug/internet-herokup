package org.example.ABTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ABTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();;
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"The Internet");
        String heading=driver.findElement(By.cssSelector(".heading")).getText();
        System.out.println(heading);
        Assert.assertEquals(heading,"Welcome to the-internet");
        driver.findElement(By.linkText("A/B Testing")).click();

        String pageHeading=driver.findElement(By.cssSelector("div.example h3")).getText();
        System.out.println(pageHeading);
        pageHeading.contains("A/B Test");
       // Assert.assertEquals(pageHeading,"A/B Test Control");
        String paragraphText=driver.findElement(By.cssSelector("div.example p")).getText().trim();
        String paragraph="Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        Assert.assertEquals(paragraphText,paragraph);
        //System.out.println(driver.findElement(By.cssSelector(".heading")).getCssValue());
        driver.quit();
    }
}
