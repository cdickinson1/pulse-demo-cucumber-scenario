Feature:
  Enter the information for the vehicle that is to be insured tha

  Scenario:
    Given I am an insurance applicant
    When I request an insurance quote for my camper
    Then I must enter my camper information in order to calculate the quote
