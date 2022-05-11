Feature: Adding the employees in HRMS Application
  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @regression
  Scenario: Adding one employee from feature file
  #  Given user is navigated to HRMS application
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully

  @123
  Scenario: Adding one employee using cucumber feature file
    And user enters "zuhoor" "Mujeeb" and "silvia"
    And user clicks on save button
    Then employee added successfully

    #data driven functionality (hybrid framework):
  @123 @test123
  Scenario Outline: Adding multiple employees
    #passing the keys:
    And user provides "<firstName>" "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully
    Examples:
      |firstName|middleName|lastName|
      |asel     |MS        |tolga   |
      |yazgul   |MS        |kishan  |
      |tarik    |MS        |mujeeb  |
      |nassir   |MS        |volkan  |

    #difference between scenario outline  and @datatable is that datatable will execute only one time but scenario outline
    #will execute the hooks and background multiple times! :
  @test @datatable
  Scenario: Add employee using data table
    #not passing any keys compare with previous example.:
    #firstName,middleName/lastName are the values
    #ase,MS,tolga these are the keys, in java this concept is called Maps. So will have here 3 maps which
    #will be stored in a List (List of Maps)
    When user provides multiple employee data and verify they are added
      |firstName|middleName|lastName|
      |asel     |MS        |tolga   |
      |yazgul   |MS        |kishan  |
      |tarik    |MS        |mujeeb  |

  @excel
  Scenario: Adding multiple employees from excel file
    When user add multiple employees from excel file using "EmployeeData" sheet and verify the user added
