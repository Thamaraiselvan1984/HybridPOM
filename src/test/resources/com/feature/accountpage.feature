
Feature: My Account page 

Background: Login with correct credentials
    Given user is on login page
    When user enters username "selvan.84@gmail.com"
    And user enters password "Thamarai@123"
    And click on login button
    And click on MyAccount
    Then user gets MyAccount page

Scenario: Accounts page title
Given user is on Account page
When user gets the title of the page
Then page title should be "My Account - Automation Practice site"

Scenario: Accounts section count
Given user is on MyAccount page
Then user gets MyAccount section
|Dashboard|
|Orders|
|Downloads|
|Addresses|
|Account Details|
|Logout|