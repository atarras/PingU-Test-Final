
@SignTest
Feature: Registration functionality 

Scenario: User successfully register with valid FDM Email
    Given User open browser and go to pingu, I open pingu sign up page  
    When User enter FDM email 
    Then User should successfully register
    
Scenario: User fails to register with non FDM Email
    Given User open browser and go to pingu, I open pingu sign up page   
    When User enter non FDM email
    Then User fail to register with invalid email 
      
Scenario: User cannot register with already used username
    Given User open browser and go to pingu, I open pingu sign up page 
    When User enter jdoe to username field
    Then User fail to register with duplicate username

      
     
      
      
