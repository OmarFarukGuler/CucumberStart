Feature: Exam
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Exam Entrance
    When Click on the element in the left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in FormContetnt
      | nameInput | <ExamName> |
    And Click on the element in the FormContent
      | academicPeriod  |
      | <AcademicPeriodOption> |
      | gradeLevel      |
      | <GradeLevelOption>     |
      | saveButton      |
    And Success message should be displayed

    And Click on the element in the left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |

    And User delete item from Dialog
      | <ExamName> |
    And Success message should be displayed
    Examples:

      | ExamName        | AcademicPeriodOption | GradeLevelOption |
      | Math exam OFG198   | academicPeriod2      | gradeLevel2      |
      | IT exam OFG198     | academicPeriod2      | gradeLevel2      |
      | Oracle exam OFG198 | academicPeriod2      | gradeLevel2      |
      | Math exam  OFG198  | academicPeriod2      | gradeLevel2      |