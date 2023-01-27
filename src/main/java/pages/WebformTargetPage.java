package pages;

import org.openqa.selenium.By;

import static driver.DriverManager.driver;


public class WebformTargetPage {


    private static By message = By.id("message");

    public static String getWebformTargetPageTitle() {
        return driver().getTitle();
    }

    public static String getMessage() {
        return driver().findElement(message).getText();
    }


}
