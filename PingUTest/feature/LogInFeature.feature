Feature: Log in function

  Background: User can load the website
    Given User launches web browser
	
  Scenario: User can log into the application with valid username and password
    Given User navigate to the home page
    When User enters valid username and valid password
    And User clicks on Login button
    Then User will be redirected to the home page

  Scenario: User cannot log into the application with valid username but invalid password
    Given User navigate to the home page
    When User enters valid username but invalid password
    And User clicks on Login button
    Then Invalid username/password error message is displayed

  Scenario: User cannot log into the application with invalid username but valid password
    Given User navigate to the home page
    When User enters invalid username but valid password
    And User clicks on Login button
    Then Invalid username/password error message is displayed

  Scenario: User cannot log into the application with invalid username and password
    Given User navigate to the home page
    When User enters invalid username and invalid password
    And User clicks on Login button
    Then Invalid username/password error message is displayed

#  Scenario: User cannot log into the application with empty username and password
#    Given User navigate to the home page
#    When User leaves username and password fields blank
#    And User clicks on Login button
#    Then Invalid username/password error message is displayed

#  Scenario: User can log out of the application
#    Given User is already logged in
#    When User click on the logout button
#    Then User will be redirected to the login page
