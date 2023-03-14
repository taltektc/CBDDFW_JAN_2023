Feature: Signup Feature

  @regression @smoke @sanity
  Scenario: User should be able to create a brand new email with unique email address
    Given user in TalentTEK Homepage
    And user click on "Create New Account" button
    And user enter First and Last Name
    And user enter Password
    And user enter Confirm Password
    And user enter DOB


