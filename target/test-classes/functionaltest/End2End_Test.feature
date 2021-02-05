Feature: API Test
	
	#Title Scenario test	
	Scenario: Get API Data
		#Keyword 'Given', to set the step background
		Given Get API user data
		#Keyword 'Then' for the assertion and matcher conditions
		Then Construct the "login" request body with the following data
      | email    | george.bluth@regres.in |
      | password | George Bluth           |