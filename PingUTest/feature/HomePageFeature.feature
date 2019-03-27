@HomeTest
Feature: Searching users/groups functionality 

  Background: User can load the website
    Given User launches web browser
    And User navigate to the home page
    And User enters valid username and valid password
    And User clicks on Login button
    And User will be redirected to the home page

  Scenario: Users can search for groups
    When User enters TD bank to search box 
    And User selects Group Search in the drop down 
    Then System should display TD Bank group  
    
  Scenario: Verify that user can search for other users
    When User enters John Doe to the search box  
    And User selects Users Search in the drop down 
    Then System should display John Doe
   
  Scenario: Verify that user can send one to one message to a logged in user 
    When I click on user message
    Then I should be able to send message to others 
   
   
   
