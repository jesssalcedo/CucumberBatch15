Feature: Search the employee

  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option

  @testCase3
  Scenario: Search employee by ID
   # Given open the browser and launch HRMS application
  #  When user enters valid email and valid password
   # And click on login button
    #When user clicks on PIM option
    When user enters valid employee id
    And Clicks on search button
    And user see employee information is displayed
   # And Close the browser


    @smoke12
  Scenario: Search Employee by Job Title
   # Given open the browser and launch HRMS application
   # When user enters valid email and valid password
  #  And click on login button
  #  When user clicks on PIM option
    When user select Job Title
    And Clicks on search button
    And user see employee information is displayed
     # And Close the browser

  # Background: This is used to define all the common steps that multiple