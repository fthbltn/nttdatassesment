@mobileNumber
Feature: Mobile Number

  Scenario Outline: User should not be able to continue if the mobile number is not correct
    Given user is on the form page
    When user enter the valid credentials
      | firstName | Mike            |
      | lastName  | Smith           |
      | email     | mikeS@gmail.com |
      | gender    | Male            |

    And user do not entered the correct the "<mobile number>"
    Then user should not be able to submit the form

    Examples:
      | mobile number  |
      | 123456789      |
      | +447785963437  |
      | 00447785963437 |
      | 5687866        |

  Scenario Outline: User should not be able to continue if the mobile number is not correct
    Given user is on the form page
    When user enter the valid credentials
      | firstName | Mike            |
      | lastName  | Smith           |
      | email     | mikeS@gmail.com |
      | gender    | Male            |
    And user entered the correct the "<mobile number>"
    Then user should be able to submit the form
    Examples:
      | mobile number |
      | 1234567890    |
      | 7785963437    |
      | 5687866846    |
