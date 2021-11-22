Feature: Testing Bigsmall

Scenario Outline: Test Validating
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And click on sign link in home page to land on secure sign in page
When User enters <email> and <password> and sign in
And Close the driver



Examples: 
|email  					|password		|
|koushik@gmail.com			|12345			|
|saikrishna@gmail.com		|67897			|



Scenario: Searching
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And Click on search Bar
And Enter "Baby Shower" in search bar
And click enter
Then select first product in the list
And verify the product price
And Close the driver

Scenario: pincode checking
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And Click on Gift Card 
Then enter "509102" 
And check the COD availability
And Close the driver


Scenario: Wish List
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And Click on wish list
And Click on settings
Then Enter "polojusaikrishna@gmail.com" in the box
And click on connect
And Close the driver

Scenario: new Links
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And click on new
Then Check Numberof links in the page
And Close the driver

Scenario: Footer
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
And click on Rakhi
Then click on Readmore
Then Navigatetohomepage
And Close the driver

Scenario: AddtoWishlist
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
Then click on top50
Then click on moon lamp
And click on Add wishlist
And Close the driver

Scenario: MouseHover
Given Initialize browser with chrome
And Navigate to "https://www.bigsmall.in/" site
Then choose ShopbyCategory and click Travel Acccessories
And select key chain and add to cart
And Close the driver










