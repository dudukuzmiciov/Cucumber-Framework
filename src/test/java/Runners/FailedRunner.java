package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //@runWith is from junit. like a support (gets the first two imports) which allows
//cucumber to run the code
@CucumberOptions(
        //features we use to provide the path of all the feature files
        //if we want to execute a specific feature file, at the end of the path mention the exact feature file (Login.feature for ex.)
        features = "@target/failed.txt", //same path will work for every other employee.same path for one frame
        //glue is where we find implementations for gherkin steps (glues the path with the steps deffinition
        //we provide the path of package to get all the step definitions
        glue = "steps",

        //dryRun we use to get the step definitions of undefined steps.
        //if we set it to true, it will quickly scan all gherkin steps whether they are implemented or not
        //if we set it to true, it stops actual execution
        // to execute scripts in real time, we should set this value to false
        dryRun = false, //by default the value of dryRun is false. If you set it to true, when adding new steps
        //in features Scenarios, true dryRun will skip running the defined steps and gives/prints in console the
        //step definitions for all undefined steps.
        // SET IT BACK TO FALSE WHEN ALL CODE IS DONE AND YOU WANT TO EXECUTE THE CODE!!! OTHERWISE "true" WILL NOT RUN THE CODE.

        //it means the console output for cucumber test is having irrelevant information
        // when we set it to true, it simply removes all the irrelevant information, it will make the code clean
        //easy to read:
        monochrome = true,

        //tags will identify the scenario based on the tag we provide in the feature file
        //use or if we need to execute scenarios from logical or keyword which will execute either of the
        //senario having the tag
        //use and if we need to execute scenarios from logical and keyword which will execute the scenarios
        //having both the tags in it
        //tags = "@sprint12", WEE DONT NEED TAGS AS THIS FILE DOESNT EVECUTE ANY FEATURES
        //html report will  be generated under target folder
        plugin = {"pretty"
        }
)

public class FailedRunner {
}
