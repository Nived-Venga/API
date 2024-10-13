Feature: Amazon Login Page

Background: 
Given Test start

#@Test1(enabled=false)
#Scenario: User login Page Validations
#Given User navigates to amazonurl
#Then Validate Title
#Then Validate Amazon Logo

#@Test2
#Scenario: Validate logged In User
#Given User navigates to amazonurl
#Given User login to amazonurl
#Then Validate Logged In User

@Test2
Scenario: Validate Searched Item
Given User navigates to amazonurl
When User selects "Baby" and Search for an "Denim"
Then User validates the searched item "Denim"