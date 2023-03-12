Feature: Login Feature
  Background:
    Given user in TalentTEK Homepage

  @regression @smoke @sanity @hb
  Scenario: User should be able to login with valid email and password
    And user enter valid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should be able to successfully login

  @hb
  Scenario: Existing user should be able to login
    And login

    @smoke @hb
  Scenario: User should not be able to login with valid email and invalid password
    And user enter valid email address
    And user enter invalid password
    When user clicks on Log In button
    Then user should be able see "You have entered an incorrect email or student Ids" message

  Scenario: User should not be able to login with invalid email and valid password
    And user enter invalid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should be able see "You have entered an incorrect email or student Id" message

  Scenario: User should not be able to login with invalid email and password
    And user enter invalid email address
    And user enter invalid password
    When user clicks on Log In button
    Then user should be able see "You have entered an incorrect email or student Id" message

