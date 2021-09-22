@email
Feature: Email Field

  @wip
  Scenario Outline: User should not be able to continue if the email format  is not correct
    Given user is on the form page
    When user enter the valid credentials for name
    And user do not enter the correct "<email>" format
    And user selected the gender
    And user entered the correct the mobile number
    Then user should not be able to submit the form

    Examples:
      | email       |
      | abc@abccom  |
      | abcdacd.com |
      | asd@123couk |



  Scenario Outline: User should not be able to continue if the mobile number is not correct
    Given user is on the form page
    When user enter the valid credentials for name
    And user enter the correct "<email>" format
    And user selected the gender
    And user entered the correct the mobile number
    Then user should be able to submit the form

    Examples:
      | email        |
      | abc@abc.com  |
      | abcd@gmail.com |
