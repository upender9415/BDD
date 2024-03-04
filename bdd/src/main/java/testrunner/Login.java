package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "FeatureFiles"//folder name
  ,glue={"StepDefinitions"} //package name for step def
  ,plugin = {"pretty", "html:target/cucumber-Report.html", "json:target/report.json"} 
  )


public class Login 
{
   
	
	
}
