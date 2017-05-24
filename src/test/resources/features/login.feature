Feature: Running Cucumber with WebDriver
  As a user of WebDriver
  I should be able to use Cucumber
  In order to run my E2E tests


  Scenario: Try to Login on Staging
    Given I go to "https://web-marvels.tipdev.com/"
    When I click the Login button
    And I login with username "protractor_mt_test" and password "tester123"
    Then I should see the "Protractor Mttest (Protractor_mt_test)" name in the header