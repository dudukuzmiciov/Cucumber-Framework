Feature: User Story -12345 - Search an employee in HRMS application
  Scenario: Search an employee by ID
    * user is navigated to HRMS application
    * user enters valid admin credentials
    * user clicks on login button
    * user navigated to employee list page
    * user enters valid employee ID
    * user clicks on search button
    * user is able to see employee information
    #when u start writing the code u mention "given, and, the" after you write the methods u can replace those with *
  Scenario: Search an employee name
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    And user navigated to employee list page
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information