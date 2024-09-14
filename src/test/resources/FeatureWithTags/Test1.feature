
Feature: This is Test1 Feature

  @Smoke @Regression
  Scenario: Scenario 1 from test1 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes
   
    @Regression
    Scenario: Scenario 2 from test1 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes
    
    @Smoke @Regression
    Scenario: Scenario 3 from test1 feature
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    Then I validate the outcomes

