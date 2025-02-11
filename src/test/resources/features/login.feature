Feature: Validation of all combinations of Login Functionality

  Scenario: User login into application with valid credentials
    Given login into portal with "admin" credential
    When user logged in successfully to application
    Then user should be redirected to the "dashboard" page
