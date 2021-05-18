package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		           features = { "src\\test\\resources\\AppFeatures\\Registration.feature" }, 
                   glue     = {"StepDefinitions" },
                   plugin   = {"pretty",
                		        "json:target/MyReports/report.json",
                		        "junit:target/MyReports/report.xml"
                		      },
                    monochrome =true
                		                		
		          )
public class UserRegistrationSteps {

	
	
}
