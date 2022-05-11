package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializers {

    public static LoginPage login; //LoginPage-class name/login-object
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static DashboardPage dash;

    public static void intializePageObjects(){
        //object creation:
        login = new LoginPage(); // login-key parameter/ LoginPage - class obj
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        dash = new DashboardPage();
        //without these objects the classes created in Pageinitializers will be empty.

    }

}
