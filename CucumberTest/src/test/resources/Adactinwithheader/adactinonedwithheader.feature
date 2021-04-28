Feature: To verification of Adactin Hotel login page

  Scenario: To verification of Adactin Hotel login page
    Given User is on the adacitn login site
    When User enrtes  username and password
      | username   | password   |
      | Rbnbalan   | 9043927392 |
      | srinivasan | 9043895560 |
    And User clicking on Login Btn
    Then User successfully logged into the homepage
