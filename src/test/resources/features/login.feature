Feature: Login Functionality

  Scenario: User logs into the portal with valid credentials
    Given user is on the login page
    When login into portal with "admin" credential
    Then user should be redirected to the "dashboard" page
