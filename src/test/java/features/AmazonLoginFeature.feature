Feature: Amazon Login Page

Background: 
Given Test start

@Test1
Scenario: User login Page Validations
Given User navigates to amazonurl
Then Validate Title
Then Validate Amazon Logo

@Test2
Scenario Outline: User Search with Multiple Data Sets
Given User navigates to amazonurl
Given User login to amazonurl
When User searches text
|Car|
|Bag|
|Phone|
Then Search Items are displayed properly 

@Test3
Scenario: Validate logged In User
Given User navigates to amazonurl
Given User login to amazonurl
Then Validate Logged In User

@Test4
Scenario: HomePageValidation
Given User navigates to amazonurl
Given User login to amazonurl
Then User validates Homepage

