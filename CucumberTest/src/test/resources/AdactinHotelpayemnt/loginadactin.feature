Feature: To verification of Adactin Hotel login and payment

  Scenario: To verification of Adactin Hotel login and payment
    Given User is on the adacitn login site
    When User enrtes  username and password
      | Rbnbalan   |
      | 9043927392 |
    And User clicking on Login Btn
    And User Search hotel type and room Location,Hotels,RoomType,NoOfRooms,CheckInDtae,CheckOutDat,AdultsperRoom and ChildrenperRoom
      | Sydney       |
      | Hotel Creek  |
      | Super Dgeluxe |
      | 3 - Three    |
      | 22/04/2021   |
      | 23/04/2021   |
      | 2 - Two      |
      | 1 - One      |
    And User search btn
    And User book a Hotel and gives Firstname,LastName,Billingaddress,Creditcardno,CreditCardType,CardExpiryMonth,CardExpiryyear and CVV
      | srini            |
      | vasan            |
      | Madurai          |
      | 1234567891234567 |
      | VISA             |
      | February         |
      |             2022 |
      |             7890 |
    And User to click Book btn
    Then User successfully logged into the homepage
