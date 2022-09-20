#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.
  #(name,last name gender employee type id qualification dokuman type dokument number personal id zorunlu alanlar dolacak

Feature: Human Resource

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create an employee
    Then Click on the element in the left Nav
      | humanResource |
      | Employees     |

    And Click on the element in the FormContent
      | addButton |
    And User sending the keys in FormContetnt
      | firstName  | <firstName>  |
      | lastName   | <lastName>   |
      | middleName | <middleName> |
    And Click on the element in the FormContent
      | gender            |
      | male              |
      | employeeType1     |
      | employeeTypeOther |

    And Action Escape

    And Click on the element in the FormContent
      | contactAddress |
      | generalinfo    |
      | EmployeeId     |
    And User sending the keys in FormContetnt
      | EmployeeId | <EmployeeId> |
    And Click on the element in the FormContent
     # | qualification |
      | dokumanType  |
      | dokumanType2 |
    And User sending the keys in FormContetnt
      | dokumanNumber | <dokumanNumber> |

    And Click on the element in the FormContent
      | contactAddress |
    And User sending the keys in FormContetnt
      | contactAddress2 | <contactAddress2> |
    And Click on the element in the FormContent
      | contactAddress3 |
      | SAVE            |
    And Already message should be displayed
     # | verifyAlready | already                       |
      | verifySuccessfullyCreated | successfully created |
    And Click on the element in the FormContent
      | backButton |
    And User sending the keys in FormContetnt
      | firstNameEmployee | <firstName> |
      | lastNameEmployee  | <lastName>  |
    And Click on the element in the FormContent
      | genderSearch |
      | maleSearch   |
  #  And wait visibil target
   #   | waitTargetEnployee | <fullName> |
  #  And Click on the element in the FormContent
      | deleteButton  |
      | deleteButton2 |
    Then Already message should be displayed
      | verifyDelete | successfully deleted |
    Examples:
      | firstName | lastName | middleName | EmployeeId | dokumanNumber | contactAddress2 | fullName                    |
      | Omer      | OFG      | Farukk     | 16548995   | 5165164       | Turkiye         | Omer Farukk OFG             |
      | Omerr     | OmFG     | Farukkk    | 16548996   | 5165165       | Turkiye         | Omerr Farukkk OmFG          |
      | Omerrr    | OmeFG    | Farukkkk   | 16548997   | 5165166       | Turkiye         | Omerrr Farukkkk OmeFG       |
      | Omerrrr   | OmerFG   | Farukkkkk  | 16548998   | 5165167       | Turkiye         | Omerrrr Farukkkkk OmerFG    |
      | Omerrrrr  | OmerFaG  | Farukkkkkk | 16548999   | 5165168       | Turkiye         | Omerrrrr Farukkkkkk OmerFaG |








