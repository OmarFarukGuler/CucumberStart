Feature: Exam

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Exam Entrance
    When Click on the element in the left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in FormContetnt
      | nameInput | omerFCoun211 |
    And Click on the element in the FormContent
      | academicPeriod        |
      | academicPeriod1           |
      | gradeLevel            |
      | gradeLevel2                |
      | saveButton            |
    And Success message should be displayed

    And Click on the element in the left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |

    And User delete item from Dialog
      |omerFCoun211|
    And Success message should be displayed