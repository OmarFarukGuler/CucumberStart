Feature: ApachiPOI Citizen Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

    Scenario: Creat and delete citizenShip from Excel
      When User creat citizenship with apachePOI
      Then User Delete citizenship with ApachePOI