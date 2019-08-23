package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\Selenium WorkSpace\\CucumberCaseStudy1\\MyCSFeatures\\MyCSFeatures.feature",glue="stepdefs",tags= {"@UAT"},plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})
public class RunCukesTest {
}
