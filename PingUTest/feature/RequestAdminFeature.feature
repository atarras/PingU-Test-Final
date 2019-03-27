
@ApproveRequest
Feature: Admin approve sign up request 

  Scenario: Users sign up successfully 
    Given User open browser and go to pingu, I open pingu sign up page  
    And User enter FDM email 
    And User should successfully register
    

  Scenario: Users send sign up request to Admin for approval
    When Admin receives a new sign up request
    And Admin approve the reuqest
    Then The user should be able to login

