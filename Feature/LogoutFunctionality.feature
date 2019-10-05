#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule with list of steps with arguments to achieve this scenarios.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate/repeat more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: Application Logout

  #Scenario: Validaing the logout functionality
    #Given Open the browser and enter the url
    #And Enter username
    #And Enter password
    #When click the submit button   
    #And click welcome button
    # And click logout button
    #Then validate the outcomes "Welcome Admin"
    
    
   Scenario Outline: Validaing the logout functionality
    Given Open the browser and enter the url
    And Enter Username <username>
    And Enter Password <password>
    When click the submit button   
    And click welcome button
    #And click logout button
    Then validate the outcomes "Welcome Admin"
    
    
 Examples:
 |username|password  |
 |"Admin" |"admin123"|
 |"test"  |"Test123"|
    
    
  
    
    


