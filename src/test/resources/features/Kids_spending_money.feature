Feature: Kids spending money
  Kids should be able to spend money from their ledger if they have some

  Scenario: Kid landing page is ledger screen
    Given I am a kid who has an account
    When kid logs in
    Then I should be redirected to the ledgar screen