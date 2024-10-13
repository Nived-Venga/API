Feature: Place

Background: 
Given Test start

@Test1
Scenario: Add Place
Given Add Place Payload
When User calls "AddPlaceAPI" with "POST" Request
Then Verify API is Success with status code 200
And "status" in responseBody is "OK"
And "scope" in responseBody is "APP"