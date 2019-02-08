package runnerclass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\mm18780\\Desktop\\Mayank\\Automation\\cucumber_pratice\\src\\test\\resource\\feature"    //Path of feature file
        ,glue = {"C:\\Users\\mm18780\\Desktop\\Mayank\\Automation\\cucumber_pratice\\src\\test\\java\\stepdefs" }             // Path of stepdefination file
        ,format = {"pretty", "html:test-output"}
        //,monochrome = true //Display console output in proper readable format
        //,dryRun = true          // Display mapping of test scenarios and stepdefination method
)

public class loginrun {

}



