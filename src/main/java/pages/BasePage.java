package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

import static driver.DriverManager.driver;

public class BasePage {
    public static WebElement getElement(By by){
        return driver().findElement(by);
    }

    public static boolean waitForPageTitle(String title) {
        return new WebDriverWait
                (driver(), Duration.ofSeconds(5)).until(ExpectedConditions.titleIs(title));
    }

    public static WebElement getVisibleElement(By by){
        return new WebDriverWait(driver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static Boolean waitUntilText(By by, String date){
        return new WebDriverWait(driver(), Duration.ofSeconds(5)).until(ExpectedConditions.textToBe(by, date));
    }
}
