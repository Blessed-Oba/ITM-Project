Feature: Validation of collaborationToolz landing page

  Scenario Outline: Landing Page login validation - Invalid scenario
    Given I navigate to collabtoolz url
    And I enter username "<username>"
    And I enter password "<password>"
    When I click on the submit button on the landing page
    Then a warning message should be displayed, "Invalid username or password."

    Examples:
      | username            | password         |
      | collaborationtool   | 6Bzbqp3ckbupVfr  |
      | collaborationtoolzz | 6Bzbqp3ckbupVfrw |
      | collaborationtoo    | 6Bzbqp3ckbupVfr  |