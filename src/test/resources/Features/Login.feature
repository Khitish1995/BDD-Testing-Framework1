

Feature: Login Page Automation For Sauce Demo Application

  Scenario: Check Login is Successful with Valid Creds
    Given User is on Login Page
    When User enters valid username and password
    And clicks on login button
    Then User is navigated to Homepage
    And close the browser

@Regression
Scenario Outline: Check Login is Successful with Valid Creds
    Given User is on Login Page
    When User enters valid "<username>" and "<password>"
    And clicks on login button
    Then User is navigated to Homepage
    And close the browser
    
    Examples: 
    | username  | password |
    | locked_out_user |  secret_sauce  |
    | problem_user    |  secret_sauce  |
    | standard_user   |  secret_sauce  |
