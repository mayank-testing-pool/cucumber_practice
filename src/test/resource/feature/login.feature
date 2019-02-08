Feature: login to Operation center


# Scenario with out example
  #Scenario: login
    #Given I am on login page
    #When I entered username as "region2jobs" and password as "Pass1234"
    #Then System should be logged in

  *Scenario with example
  Scenario Outline: login
    Given I am on login page
    When I entered username as "<username>" and password as "<password>"
    Then System should be logged in

  Examples:
      | username | password |
      | username1 | password1 |
      | username2 | password2 |
      | username3 | password3 |
      | username4 | password4 |
      | username5 | password5 |
      | username6 | password6 |


    # when we use example then scenario become S`cenario Outline else it will become Scenario

