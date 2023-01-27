package driver;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static driver.DriverManager.driver;
import static driver.DriverManager.setDriver;

public final class Driver {

    private Driver() {
    }


    public static void initDriver() {
        if (driver() == null) {
            String browser = ConfigReader.getConfig().browser();
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            driver().get(ConfigReader.getConfig().url());
            driver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }

    public static void quitDriver() {
        if (driver() != null) {
            driver().quit();
            setDriver(null);
        }

    }
}
