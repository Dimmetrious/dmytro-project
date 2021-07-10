Feature: Testing DatePicker

  Scenario Outline: Testing condition when user enters only Year
    When User enters <year> into year field
    And User submits date
    Then User compares actual result with expected
    Examples:
      | year |
      | 1999 |
    Examples:
      | year |
      | 2020 |
    Examples:
      | year |
      | 2021 |
    Examples:
      | year |
      | 2030 |


  Scenario Outline: Testing condition when user enters Year and Month
    When User enters <year> into year field
    And User enters <month> into month field
    And User submits date
    Then User compares actual result with expected
    Examples:
      | year | month |
      | 1999 | 06    |
    Examples:
      | year | month |
      | 2020 | 11    |
    Examples:
      | year | month |
      | 2021 | 11    |
    Examples:
      | year | month |
      | 2021 | 07    |
    Examples:
      | year | month |
      | 2030 | 06    |