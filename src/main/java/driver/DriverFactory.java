package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser){
        WebDriver driver;
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        return driver;
    }
}
