#Author: juan.martineza@sophossolutions.com


Feature: Google Translate
  as a web user
  i was to use google translate
  to translate words between different languages
  
  Scenario: translate from english to spanish
    Given that susan want to translate a word
    When she tranlate the word "cheese" from english to spanish
    Then she should see the word "queso" in the screen

