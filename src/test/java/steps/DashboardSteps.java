package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {
    @Then("user verifies all the dashboard tabs")
    public void user_verifies_all_the_dashboard_tabs(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();

        //this data is coming from feature file
        List<String> expectedTabs = dataTable.asList();

        List<String> actualTabs = new ArrayList<>();

        for(WebElement ele :dash.dashboardTabs){
            actualTabs.add(ele.getText());
        }
        System.out.println(actualTabs); //coming from my execution
        System.out.println(expectedTabs); //coming from my feature file

        //Assert.assertEquals(actualTabs,expectedTabs);

        //if assertions is passed it will not give u any information and will execute our codee
        //is assertions is failed it will give u an error with comparison
        Assert.assertTrue(expectedTabs.equals(actualTabs));
    }
}
