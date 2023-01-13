Feature: Testing reqres API Get User
  @Latihan
  Scenario Outline: Get List user with valid parameter
    Given Get list user with page <page>
    When Send request get list user
    Then Should return status get code 200
    And Response body should be page <page>
    And validate json schema list user
    Examples:
      | page |
      | 1    |
      | 2    |

    @Tugas
  Scenario Outline: Get List user with invalid parameter
    Given Get list user with page "<page>"
    When Send request get list user
    Then Should return status get code 404
    Examples:
      | page |
      | -    |
      | ab   |
      | #$%  |
