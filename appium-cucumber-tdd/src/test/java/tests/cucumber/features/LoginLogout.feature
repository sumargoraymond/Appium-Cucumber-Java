@Feature
Feature: Login Logout Feature

  Scenario: Login the app successfully as a candidate
    Given I am on homepage and I click profil
    When I click Masuk dengan Google+
    And I choose login with existing Google account
    Then I should see my name "Raymond Lucky"
    And I log out of my account