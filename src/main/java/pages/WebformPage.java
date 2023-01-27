package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import static utils.common.getCurrentDate;


public class WebformPage extends BasePage {

    private final static By textBox = By.id("my-text-id");
    private final static By submitButton = By.cssSelector("[type='submit']");
    private final static By datePickerBox = By.name("my-date");
    private final static By datePopup = By.className("datepicker-days");


    public static boolean getWebformPageTitle() {
        return waitForPageTitle("Web form");
    }

    public static void enterText(String text) {
        getElement(textBox).sendKeys(text);
    }

    public static void clickSubmitButton() {
        getElement(submitButton).click();
    }

    public static void clickDatePickerBox() {
        getElement(datePickerBox).click();
    }

    public static boolean isDatePopupDisplayed(){
        return getVisibleElement(datePopup).isDisplayed();
    }

    public static String keyEnterDateMatch(){
        getElement(datePickerBox).sendKeys(Keys.ENTER);
        return getElement(datePickerBox).getAttribute("value");

    }

    public static void getDate(){
        String date = getCurrentDate();
        System.out.println(date);
    }


}
