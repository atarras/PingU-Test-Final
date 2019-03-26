Feature: Admin Functionality

  Background: Admin can load the website
    Given User launches web browser
			
  	Scenario: Admin can log into the application with valid username and password
    Given User navigate to the home page
    When User enters valid username and valid password
    And User clicks on Login button
    Then User will be redirected to the home page
		
    Scenario: Admin can approve a trainee
    Given User navigate to the home page
    And User enters valid username and valid password
    And User clicks on Login button
    And Admin navigate to the trainee page
    When Admin moves scroll bar of table
    And Clik on actions tab
    Then click on lock icon to unlock it
    And user should be able to login into account with valid credentials
    