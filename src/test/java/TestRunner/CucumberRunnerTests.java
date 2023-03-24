package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        features = {"src/test/resources/Features/addCustomer.feature",

        "src/test/resources/Features/getApi.feature",
        "src/test/resources/Features/postApi.feature",
        "src/test/resources/Features/appAutomation.feature"}, glue = {"StepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/feature.html"
        },
        tags = "@Scenario5" )
@Test
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
//        @BeforeClass
//        public static void beforeClass(){
//
//        }
//        @AfterClass
//        public static void AfterClass(){
//
//        }

}