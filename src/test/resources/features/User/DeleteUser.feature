Feature: Testing reqres API Delete user
  @Delete
  Scenario Outline: Delete users with valid id
    Given Delete user with valid id <id>
    When Send request delete user
    Then Should return status delete code 204
    Examples:
      | id |
      | 1  |
      | 2  |

    @Tugas
    Scenario Outline: Delete users with invalid id
      Given Delete user with invalid id "<id>"
      When Send request delete user
      Then Should return status delete code 404
      Examples:
        | id |
        | -  |
        | ab |