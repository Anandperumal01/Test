Feature: Login functionality of OrangHRM application

Background:
    Given User navigate to the organgeHRM application 
  @smoke @regression
  Scenario: Verify user should be able to login to application
    And User enter the user name as Admin
    And User enter the password as admin123
    When User click on the login button
    Then Login should be success


  #Scenario: Verify user should not be able to login to application
  #  Given User navigate to the organgeHRM application
  # And User enter the user name as Admin
  #And User enter the incorrect password as anything
  #When User click on the login button
  #But user should not able to login
  @sanity @smoke
  Scenario: Verify user should be able to login to application by parameterization concept
    And User enter the user name as "Admin"
    And User enter the password as "admin13"
    When User click on the login button
    Then Login should be success
    
  @regression
  Scenario Outline: Verify user should be able to login to application by Data Table
    And User enter the user name as "<username>"
    And User enter the password as "<password>"
    When User click on the login button
    Then Login should be success

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | test     | pass     |
      | tester1  | wrong    |
