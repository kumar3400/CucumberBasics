package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		           features = { "src\\test\\resources\\AppFeatures\\Order.feature" }, 
                   glue     = {"StepDefinitions"},
		           plugin =   {"pretty"},
		           
		           monochrome =true  //this is for console output needs to show order and neet
		        
                   
                   
                   
		          )
public class OrederTest {

}
