package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/" + testName + ".png");
            Files.copy(src.toPath(), dest.toPath());
        } catch (Exception e) {
            System.out.println("Screenshot failed");
        }
    }
}
