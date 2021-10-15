Feature: To Validate Login page in amazon

  Scenario Outline:To validate login page using invaid credencials

    Given User in amazon home page
    When User Enter invalid "<Email>"login id
    And User Click the continue button
    And User enter invalid "<Password>" password
    Then User close the browser

    Examples: 
      | Email               | Password     |
      | java@gmail.com      | java@123     |
      | selenium@gmail.com  | selenium@123 |
      | framework@gmail.com | frame@123    |
      | sql@gmail.com       | sql@123      |
