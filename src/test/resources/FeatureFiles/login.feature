Feature: To validate the facebook login functionality

	Scenario Outline: To validate the login functionality with invalid credentials
	
		Given The user has to be im faebook page 
		When The user has  to fill username"<username>" and password "<password>"
		And The user has to click the login button
		Then The user navigate to the invalid login page

Examples:
|username|password|
|sarath|sarath1234|
|raj|1234|
|preethi|preethi|
|saravanan|sara1234|
  