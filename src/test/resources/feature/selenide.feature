Feature: autotest with selenide framework

  """
  Available browsers : Chrome,FireFox,Opera;
  vacancy title is taken from 'https://ctco.lv/careers/vacancies/';
  paragraph is taken from vacancy description page;
  """


  Scenario: Testing C.T.Co website with selenide
    Given I setup "chrome" browser
    When I navigate to "https://ctco.lv/en" url
    And I open vacancy with title "Senior Test Engineer"
    Then I verify that paragraph under "Professional skills and qualification": contains exactly 7 skills