package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Regression or @Smoke or @Sanity", 
features= {"src/test/resources/Features"}, 
//features= {"src/test/resources/FeatureWithTags"}, 
glue= {"StepDefinitions"}, 
plugin= {"pretty", "html:target/htmlreport.html"} )

public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {

}
