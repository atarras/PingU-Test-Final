Feature: Updating the user profile
 
 Background: User can load the website
    Given User launches web browser
  
  @SmokeTest  
  Scenario: User should be able to update the country field to 'Germany' successfully
   	Given Click on profile icon
   	When Enter 'Germany' in country field
   	Then Click on submit button
   	And User should get appropriate success message
   	
  Scenario: User should be able to update the city field to 'Frankfurt' successfully
   	Given Click on profile icon
   	When Enter 'Frankfurt' in city field
   	Then Click on submit button
   	And User should get appropriate success message
   	  	
  Scenario: User should be able to update the phone number field to '+4967464737466' successfully
   	Given Click on profile icon
   	When Enter '+4967464737466' in phone number field
   	Then Click on submit button
		And User should get appropriate success message

  Scenario: User should not be able to update empty field
   	Given Click on profile icon
   	When Leave country  city and phonenumber empty
   	Then Click on submit button
   	And User should get appropriate error message
   	
  Scenario: User should not be able to update password
   	Given Click on profile icon
   	And Click on Password and security Link
   	When Enter current password
   	And Enter new password 
   	And Confirm new password
   	Then Click on submit button
   	And User should get be able to update the password