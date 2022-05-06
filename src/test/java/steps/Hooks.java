package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    //In order to shorten the code we use hooks class, comment out all tearDown() methods from all steps package
    // and all "Given user is navigated to HRMS application" from all scenarios in features package.

    @Before
    public void start(){
        openBrowserAndLauchApplication();
    }

    @After
    public void end(Scenario scenario){
        byte[] pic;
        //scenario class from cucumber holds the complete information of our execution
        if(scenario.isFailed()){
            pic = takeScreenshot("failed/" + scenario.getName());
        }else{
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        //it will attach the pic in report
        scenario.attach(pic, "image/png", scenario.getName());
        tearDown();
    }


}
