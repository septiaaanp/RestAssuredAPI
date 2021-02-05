package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionaltest",
        glue = {"stepDefinitions"},
        monochrome = true,
        strict = true
)

public class TestRunner {

}