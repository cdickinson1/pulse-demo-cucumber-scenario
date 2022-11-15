Feature:Add Items back to inventory Scenario Example
  As a store owner,
  I want to add items back to inventory when thry are returned or exchanged,
  so that I can track that inventory

Scenario:Items reutrned for refund should be added to inventory.
Given that a customer previously bought a black sweater from me
And I have three black sweaters in inventory,
When they return the black sweaters for a refund,
Then I should have four black sweater in inventory.