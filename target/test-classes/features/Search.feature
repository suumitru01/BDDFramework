Feature: Search and Place Order for vegetables

@SelTest
Scenario Outline: Search for Items and Validate result
Given User is on GrrenKart home page
When User search for <name> vegetable
Then <name> item will dispalyed

Examples:
			|name|
			|Cucumber|
			|Brinjal|

@SelTest
Scenario: Search for Items and move to checkout page
Given User is on GrrenKart home page
When User search for Brocolli vegetable
And Added items to cart
And User proceed to checkout
Then Brocolli item will dispalyed on cart

