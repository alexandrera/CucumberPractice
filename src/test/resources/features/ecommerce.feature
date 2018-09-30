Feature: Manage items on order 
	User is able to add one product to cart and place the order
	User is able to add two products to cart and place the order
	User is able to remove one product from cart

Background: 
	Given user accesses the URL Address 
	When correct user and password are filled 
	Then it is possible to perform login 
	
Scenario Outline: 
	User searches and add one and two items to the cart in order to buy 
	Given user searches a specific product 
	When open product details 
	And add <quantity> product to cart 
	Then it is possible to pay it by using bank-wire payment <answer> 
	
	Examples: 
		|quantity|answer|
		|"1"|"Ok with 1"|
		|"2"|"Ok with 2"|
		
Scenario: User removes an item from shopping cart 
	Given user searches a specific product 
	When open product details 
	And add one product to cart 
	Then remove product from cart 