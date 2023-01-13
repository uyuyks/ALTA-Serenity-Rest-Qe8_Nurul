Feature: Testing reqres API create user
  @Latihan
  Scenario Outline: Post create new user with valid json
    Given Post create user with valid json
    When Send request post create user
    Then Should return status create code 201
    And Response body name should be "<name>" and job "<job>"
    Examples:
      | name  | job        |
      | Nurul | Programmer |

  @Tugas
  Scenario Outline: Post create new user with invalid json
    Given Post create user with invalid json
    When Send request post create user
    Then Should return status create code 400
    Examples:
      | name | job        |
      |      | Pr0gr4mm3r |
