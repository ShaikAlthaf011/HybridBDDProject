package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/feature",glue={"StepDefinition"},tags="@Test3")
public class TestRunner extends AbstractTestNGCucumberTests {

}
