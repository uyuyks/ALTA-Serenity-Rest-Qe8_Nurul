Feature: Testing reqres API Login user
  @Tugas
  Scenario Outline: Login user with valid json
    Given Post login user with "Valid" json "<filename>"
    When Send request login user
    Then Should return status login code 200
    And Validate response body login with valid json schema
    Examples:
      | filename            |
      | ValidLoginUser.json |

  @Tugas
  Scenario Outline: Login user with invalid json
    Given Post login user with "Invalid" json "<filename>"
    When Send request login user
    Then Should return status login code 400
    And Validate response body login with invalid json schema
    Examples:
      | filename            |
      | InvalidLoginUser.json |