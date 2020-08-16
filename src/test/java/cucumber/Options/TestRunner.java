package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/Search.feature", glue= {"stepDefinations"}
,plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"})
public class TestRunner {

}
