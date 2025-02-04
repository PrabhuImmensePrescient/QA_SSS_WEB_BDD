Feature: Login Functionality

  Scenario: User logs into the portal with valid credentials
    Given the user is on the login page
    When login into portal with "admin" credential
    Then the user should be redirected to the "<dashboard>" page
