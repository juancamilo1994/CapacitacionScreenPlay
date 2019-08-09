#Author: juan.martineza@sophossolutions.com

#se defibe la historia de usuario
@tag
Feature: Busqueda en Google
  Juan Camilo como usuario quiere entrar a google y buscar una palabra

#se arma el caso de prueba colocando las precondiciones, la accion que se realizara y el resultado esperado
  @smoketest
  Scenario: Busquedad exitosa
    Given que Juan Camilo esta la pagina de google
    When busca la palabra "quesito"
    Then deberia ver el resultado "Quesito - Wikipedia, la enciclopedia libre" de wikipedia
    
    
#   And check more outcomes

#este tambien es una manera de hacer la prueba solo que con una tabla la cual se coloca los datos de entrada 
#  @tag2
#  Scenario Outline: Title of your scenario outline
#   Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
