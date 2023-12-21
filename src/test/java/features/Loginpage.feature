#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
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

 Feature: login test
 
  Scenario Outline: testing login page with different set of data
    Given User is navigate to login page
    When  enter username as "<username>" and  enter password as "<password>"
    And when user click login button
    Then it move to login page and a success message
    Examples: 
      | username  | password| 
      | Admin     |   admin123    |
      | Admin  |    student      | 
      | stud   |   admin123 |