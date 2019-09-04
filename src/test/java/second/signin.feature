
Feature:This is login functionality
 This Scenario is for Login

  Scenario: Successful login
   When user enters user id as "Sowmi" in the user id field
   And password as 12345 in the password field
      And i click on login
   Then the homepage is displayed
   
    Scenario: Fail
   When user enters user id as "Vidhya" in the user id field 
   And password as 67890 in the password field
      And i click on login
   Then the homepage is not displayed
   

 
