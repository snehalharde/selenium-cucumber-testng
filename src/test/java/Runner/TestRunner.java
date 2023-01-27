package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                    "html:target/cucumber-reports/cucumber-report.html",
                    "json:target/cucumber-reports/cucumber-report.json"},
        features = {"src/test/resources/features/Webform.feature"},
        glue = {"StepDefinitions"},
        monochrome = true,
        tags = "@SmokeTest"

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
