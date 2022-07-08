Feature: Login page Valdation

  Scenario Outline: Login page validation with valid credentials
    Given User is on the login page.
    When user enters the <username> and <password>
    And Click on the login button
    Then the user is navigate to homepage

    Examples: 
      | username            | password      |
      | maruthibn@ymail.com | 143anasuyamma |
