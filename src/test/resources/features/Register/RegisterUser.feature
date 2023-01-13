Feature: Testing reqres API register user
  @Tugas
  Scenario Outline: register user with valid json
    Given Post register user with "Valid" json "<filename>"
    When Send request register user
    Then Should return status register code 200
    And Validate response body with json schema
    Examples:
      | filename               |
      | ValidRegisterUser.json |

  @Tugas
  Scenario Outline: register user with invalid json
    Given Post register user with "Invalid" json "<filename>"
    When Send request register user
    Then Should return status register code 400
    And Validate response body with invalid json schema
    Examples:
      | filename                 |
      | InvalidRegisterUser.json |