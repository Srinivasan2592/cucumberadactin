Feature: Verifying adactin Hotel login verification

  Scenario Outline: to verify adactin hotel profile login
    Given User is on the adacitn login site
    When User enrtes  "<username>" ,"<password>"
      | username | password   |
      | Rbnbalan | 9043927392 |
    And User clicking on Login_Btn
    Given User is in Book A Hotel page
    And User book a Hotel "<Firstname>","<LastName>","<Billingaddress>","<Creditcardno>","<CreditCardType>","<CardExpiryMonth>","<CardExpiryyear>","<CVV>"
    And User clicking on  Btn
    And User clicking on Search_Btn
    And User Search hotel type and room "<Location>","<Hotels>","<RoomType>","<NoOfRooms>","<CheckInDtae>","<CheckOutDate>","<AdultsperRoom>","<ChildrenperRoom>"
    Then User successfully logged into the homepage
      
      Examples:
      
      | Location | Hotels      | RoomType | NoOfRooms | CheckInDtae | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Sydney   | Hotel Creek | Standard | 2 - Two   | 20/04/2021  | 21/04/2021   | 2 - Two       | 1 - One         |
   		| Firstname | LastName | Billingaddress  | Creditcardno     | CreditCardType | CardExpiryMonth | CardExpiryyear | CVV  |
      | Rbnbalan | 9043927392 | Sydney   | Hotel Creek | Standard | 2 - Two   | 20/04/2021  | 21/04/2021   | 2 - Two       | 1 - One         | srini     | vasan    | Madurai address | 1234567891234567 | VISA           | May             |           2022 | 6969 |
    

 

    
    
    

