   Feature: This is Test3 Feature
  
  @Sanity
  Scenario: Scenario 1 from test3 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes
    
    @Regression
    Scenario: Scenario 2 from test3 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes
    
    @Smoke
    Scenario: Scenario 3 from test3 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes