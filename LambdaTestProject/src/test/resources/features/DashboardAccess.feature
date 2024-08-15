Feature: CollabToolz Dashboard Access with different account types

  Scenario Outline: Dashboard with valid logins
    Given I am on the home page with login details "collaborationtool" "6Bzbqp3ckbupVfrw"
    And I select the login button in blue
    And I entered the credentials "<accountType>" "<emailAddress>" "<password>"
    When I click on the user login button
    Then I should be able access the dashboard
    Examples:
      | accountType | emailAddress         | password     |
      | Student     | ajokepetra@gmail.com | #Omolola0    |
      | Recruiter   | andynetcs@gmail.com  | London12     |
      | Landlord    | jfashtest@gmail.com  | Password123! |

  Scenario Outline: Error validations on the Dashboard logins page
    Given I am on the home page with login details "collaborationtool" "6Bzbqp3ckbupVfrw"
    And I select the login button in blue
    When I entered the credentials "<accountType>" "<emailAddress>" "<password>"
    Then a warning message should popup
    Examples:
      | accountType | emailAddress           | password       |
      | Student     | ajokepetra@gmail.com   | London313      |
      | Recruiter   | andynetcsee@gmail.com  | London12       |
      | Landlord    | jfashtesting@gmail.com | Password123!k* |