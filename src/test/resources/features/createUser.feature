Feature: List of scenarios.

  Scenario: Create an Supervisor with valid details
    Given login into portal with "admin" credential
    When admin creates an "Supervisor" with given details
      | firstName | lastName | email | password | phone | dob | state | city | address | pincode | joiningDate | releavingDate |
    Then verify the newly created user
