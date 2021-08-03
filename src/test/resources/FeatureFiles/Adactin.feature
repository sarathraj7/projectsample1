#@adactin
#Feature: To validate Hotel ticket booking
#
  #Background: 
    #Given User is in adactin login page
    #When User enter valid username and valid password
      #| preethi0000 | 123456789 |
      #| sql         | sql@123   |
    #And User click login button
#
  #@sanity
  #Scenario: To validate ticket booking for New York.
    #And User select Location,Hotels,Room Type and Number of rooms
    #And User select Check In Date,Check out Date,Adults per Room and Children per Room
      #| 27/06/2021 | 28/06/2021 |
    #And User click Search button
    #And User select radio button and click the continue button
    #And User click Search button
    #And User enter First Name and Last Name,Billing Address and Credit Card No
    #And User select Credit Card Type and Expiry Date,CVV Number and click Book Now button
    #Then User must be in booking confirmation page
#
  #@smoke
  #Scenario Outline: To validate ticket booking for Sydney
    #And User select Location,Hotels,Room Type and Number of rooms
    #And User select Check In Date,Check out Date,Adults per Room and Children per Room
    #And User click Search button
    #And User select radio button and click the continue button
    #And User click Search button
    #And User enter First Name and Last Name,Billing Address and Credit Card No
      #| jaya | preethi | krishnagiri | 1234567890123456 |
    #And User select Credit Card Type and Expiry Date,CVV Number and click Book Now button
    #Then User should be in booking confirmation page
#
    #Examples: 
      #Examples:
#
      #| Check In Date | Check out Date | CVV Number | Location | Hotels      | Room Type | Number of rooms |
      #| 27/06/2021    | 28/06/2021     |       3456 | Sydney   | Hotel Creek | Deluxe    |               1 |
