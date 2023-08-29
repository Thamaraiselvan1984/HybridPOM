Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Facebook – log in or sign up"

Scenario:Forgotten Password link
Given user is on login page
Then forgotten password link should be displayed
  
Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "selvan.84@gmail.com"
    And user enters password "Thamarai@123"
    And click on login button
    Then user gets the title of the home page
    Then home page title should be "Facebook"

