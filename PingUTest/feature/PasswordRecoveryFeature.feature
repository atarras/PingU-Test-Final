Feature: Password recovery function

  Background: User can load the website
    Given User launches web browser

  Scenario: User can change password with valid username, security question, security answer and matching password
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters valid username
    And User selects valid security question
    And User enters valid security answer
    And User enters valid new password
    And User enters matching new password
    And User clicks on Submit button
    Then User will be redirected to the login page
    And User enters valid username and valid new password
    And User clicks on Login button
    And User will be redirected to the home page

  @RunThis
  Scenario: User cannot change password with valid username and matching password but invalid security question and security answer
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters valid username
    And User selects invalid security question
    And User enters invalid security answer
    And User enters valid new password
    And User enters matching new password
    And User clicks on Submit button
    Then Password change is unsuccessful message will be displayed

  Scenario: User cannot change password with valid username, security question and matching password but invalid security answer
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters valid username
    And User selects valid security question
    And User enters invalid security answer
    And User enters valid new password
    And User enters matching new password
    And User clicks on Submit button
    Then Password change is unsuccessful message will be displayed

  Scenario: User cannot change password with valid username, security answer and matching password but invalid security question
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters valid username
    And User selects invalid security question
    And User enters valid security answer
    And User enters valid new password
    And User enters matching new password
    And User clicks on Submit button
    Then Password change is unsuccessful message will be displayed

  Scenario: User cannot change password with valid username, security question and security answer but not matching password
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters valid username
    And User selects valid security question
    And User enters valid security answer
    And User enters valid new password
    And User enters not matching new password
    And User clicks on Submit button
    Then Password change is unsuccessful message will be displayed

  Scenario: User cannot change password with invalid username but valid security question, security answer and matching password
    Given User navigate to the home page
    And User clicks on the forgot password link
    When User enters invalid username
    And User selects valid security question
    And User enters valid security answer
    And User enters valid new password
    And User enters matching new password
    And User clicks on Submit button
    Then Password change is unsuccessful message will be displayed
