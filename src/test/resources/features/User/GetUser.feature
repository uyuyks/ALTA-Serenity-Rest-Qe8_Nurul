Feature: Testing reqres API get single user
  @Tugas
  Scenario Outline: get user with valid id
    Given get single user with valid id "<id>"
    When Send request get single user
    Then Should return status get single user code 200
    And validate response body with json schema
    Examples:
      | id |
      | 1  |
      | 2  |
      | 3  |

  @Tugas
  Scenario Outline: get user with invalid id
    Given get single user with invalid id "<id>"
    When Send request get single user
    Then Should return status get single user code 404
    Examples:
      | id |
      | -  |
      | ab |
      | 23 |