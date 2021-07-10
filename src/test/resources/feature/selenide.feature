Feature: autotest with selenide framework

  Scenario: Testing C.T.Co website with selenide
    Given I setup "chrome" browser
    When I navigate to "https://ctco.lv/en" url
    And I open vacancie with title "Senior Test Engineer"
    Then I verify that paragraph under "Professional skills and qualification": contains exactly 7 skills