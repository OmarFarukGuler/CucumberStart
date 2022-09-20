#  Bir önceki create a fee,delete fee scenario
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |




Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario Outline: Create a Fee, delete Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <nameInput>       |
      | codeInput       | <codeInput>       |
      | integrationCode | <integrationCode> |
      | priority        | <priority>        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog
      | <nameInput> |

    And Success message should be displayed
    Examples:

      | nameInput    | codeInput | integrationCode | priority |
      | omerFees2110 | 1234545   | 12345464        | 12345451 |
      | omerFees2112 | 1234546   | 12345466        | 12345452 |
      | omerFees2113 | 1234549   | 12345463        | 12345453 |




