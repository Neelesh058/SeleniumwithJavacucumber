Feature: Login


  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
<<<<<<< HEAD
    And close browser

  Scenario: Add New Customer

    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser

  Scenario: Search Customer by Email

    When User click on customers Menu
    And click on customers Menu Item
    And Enter customer EMail
    When Click on search button
    Then User should found Email in the Search table
=======
>>>>>>> parent of 9d1e427 (Fourth commit)
    And close browser