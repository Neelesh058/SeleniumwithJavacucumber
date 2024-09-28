package testRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {".//Features/Login.feature"},
        glue="stepDefination",
        dryRun = false,
        monochrome = true,
//        tags = "@Sanity",//scenarios under @sanity tag will be executed
        plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
