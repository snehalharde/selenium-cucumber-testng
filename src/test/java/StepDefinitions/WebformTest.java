package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static driver.Driver.initDriver;
import static driver.Driver.quitDriver;
import static pages.WebformPage.*;
import static pages.WebformTargetPage.getMessage;
import static utils.common.getCurrentDate;

public class WebformTest {

    @Before
    public void before() {
        initDriver();
    }

    @Given("user enter {string}")
    public void userEnter(String arg0) {

        Assert.assertTrue(getWebformPageTitle());
        enterText(arg0);
    }

    @When("user clicks submit button")
    public void userClicksSubmitButton() {
        clickSubmitButton();

    }

    @Then("page has {string} and {string} is displayed")
    public void isDisplayed(String title, String arg0) {
        Assert.assertTrue(waitForPageTitle(title));

        Assert.assertEquals(getMessage(), arg0);
    }


    @Given("User click on the date picker")
    public void userClickOnTheDatePicker() {
        Assert.assertTrue(getWebformPageTitle());
        clickDatePickerBox();
    }

    @When("Date picker pop up is displayed")
    public void datePickerPopUpIsDisplayed() {
        Assert.assertTrue(isDatePopupDisplayed());

    }

    @Then("current date in text box")
    public void validateCurrentDate() {
        Assert.assertTrue(isDatePopupDisplayed());
        String currentDate = getCurrentDate();
        String pageDate = keyEnterDateMatch();
        Assert.assertEquals(pageDate, currentDate);
    }

    @After
    public void quit() {
        quitDriver();
    }

}
