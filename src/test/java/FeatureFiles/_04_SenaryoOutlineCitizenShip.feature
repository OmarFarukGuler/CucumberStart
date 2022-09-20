Feature:  Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
   # Then Cookies isDisplayed
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed

    And Wait until invisibility element
    |alreadyExist|

    And Click on close button

    And Wait until element clicable
      |searchButton|
    And User delete "<CitizenshipName>" from Dialog

    Then Success message should be displayed

    Examples:
      | CitizenshipName | ShortName |
      | omerFG1        | OFG1    |
    #  | omerFG2        | OFG2    |
    #  | omerFG3        | OFG3    |
    #  | omerFG4        | OFG4    |
    #  | omerFG5        | OFG5    |


