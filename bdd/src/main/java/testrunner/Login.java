package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:\\Users\\upend\\Downloads\\Upender Reddy Personal\\WorkSpace\\bdd\\FeatureFiles"//folder name
  ,glue={"StepDefinitions"} //package name for step def
  )


public class Login 
{
   
	
	
}
