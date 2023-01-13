Feature: Testing reqres API update user
  @Latihan
  Scenario Outline: Put update user with valid json
    Given Put update user with valid json with id <id>
    When Send request put update user
    Then Should return status update code 200
    And Response body update name should be "<name>" and job "<job>"
    Examples:
      | id | name  | job        |
      | 1  | Nurul | Programmer |

  @Tugas
  Scenario Outline: Put update user with invalid json
    Given Put update user with invalid json with id "<id>"
    When Send request put update user
    Then Should return status update code 400
    Examples:
      | id | name  | job        |
      | -  | Nurul | Programmer |