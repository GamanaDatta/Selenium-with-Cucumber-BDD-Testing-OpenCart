Feature: OpenCart Test

Scenario: Validate LoginPage

Given User Opens Browser
When User is on OpenCart
Then User Clicks on loginPage
Then User Enters Username name Password and submits
Then Homepage appears


Scenario: Validate EditPage

Given User is on HomePage
When User clicks on Edit Account Page
Then User is on EditAccountPage
Then User Changes First name and Last name and submits
Then Successfully changed


Scenario: Validate WishListPage
Given User is on the HomePage
When User clicks on WishListPage
Then User is on wishlistpage
Then User Adds item to wish list through search
Then product appears on wishlist

Scenario: Validate Comparision
Given User is on Home
When User searches a product and adds to compare page
Then User adds 2nd product to compare page
Then items appears on compare page