Feature: Registration on LambdaTest Website

Background:
  Given I navigate to the form demo website

  @Positive
  Scenario: Valid form registration
    And I enter my full name
    And I enter a valid email address
    And I enter a valid password
    And I enter my company name
    And I enter my company website address
    And I select a country from the drop down list
    And I enter my city
    And I enter my first line of address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    When I click the submit button
    Then The form should be submitted successfully

  @TestSuit
  Scenario Outline: Valid form registration
    And I enter my full name "<fullName>"
    And I enter a valid email address "<emailAddress>"
    And I enter a valid password "<password>"
    And I enter my company name
    And I enter my company's  website "<website>"
    And I select a country from the drop down list
    And I enter my city "<city>"
    And I enter my first line of address "<firstlineAddress>"
    And I enter my second line of address "<secondlineAddress>"
    And I enter my state "<state>"
    And I enter my zipcode "<zipCode>"
    When I click the submit button
    Then The form should be submitted successfully
    Examples:
      | fullName    | emailAddress           | password        | website                    | city    | firstlineAddress            | secondlineAddress | state      | zipCode |
      | Bevely Tanny | beverlytanny@gmail.com | bevlytnnyt324#  | http://www.bevelytanny45   | tokyo   | 1, qualitytimestreet        | tokyo             | japan      | JP422   |
      | Allan Jones  | allanjones@gmail.com   | allanjonest564$ | http://www.allanjones46745 | gregory | 1, greatnessassurancestreet | assurance         | manchester | MS576   |
      | Omo Jesu     | omojesu@gmail.com      | omojesu$@t#     | http://www.omojesu567t     | bolton  | 1, omojesulovestreet        | ifeoluwa          | orire      | OR546   |
      | Temi Lola    | temilola@gmail.com     | temilola78#     | http://www.temilola727     | ikeja   | 4, obanijesustreet          | oluwaawonoluwa    | eden       | ED4UV   |


  @InvalidNameField
  Scenario: Negative testing around name field
#    And I omit my first name
    And I enter a valid email address
    And I enter a valid password
    And I enter my company name
    And I enter my company website address
    And I select a country from the drop down list
    And I enter my city
    And I enter my first line of address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    When I click the submit button
#    Then The form should be not submitted successfully


  Scenario: Negative testing around email field
#    And I enter my first name
#    And I enter an invalid email address
#    And I enter a valid password
    And I enter my company name
    And I enter my company website address
    And I select a country from the drop down list
    And I enter my city
    And I enter my first line of address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    When I click the submit button
#    Then The form should be not submitted successfully

