package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files:
        features = "src/test/resources/features/Login.feature",
        //glue is where we find implementations for gherkin steps
        //we provide the path of package to get all the step definitions
        glue = "steps",
        //dryRun we use to get the step definitions of undefined steps.
        //if we set it to true it will quickly end all gherkin steps whether implemented or not
        //if we set it to true, it stops actual execution
        //to execute scripts in real time, we should set this value to false
        dryRun = false,
        //it means the console output for cucumber test is having irrelevant information
        //when set it to true it simply removes all the irrelevant info from the console
        monochrome = true, // makes the info very clear
        //telling ur framework which exactly feature to be run!
        tags="@regression" //you can use "or" "and" to give 2 tags of two scenarios to be run
)
public class Regression {
}
