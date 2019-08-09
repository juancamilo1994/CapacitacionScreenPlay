#Author: juan.martineza@sophossolutions.com

@tag
Feature: Agregar producto a carrito de compras
  Juan Camilo como usuario quiere entrar a Tottus Peru y agregar un producto al carrito de compras

@smoketest
  Scenario: Pruducto agregado exitosamente
    Given Que Juan Camilo este en la pagina de tottus peru
    When Agregar el pruducto "televisor" al carrito de compras
    Then Deberia ver el pruducto 'Led 43" Ultra HD Ai Smart TV - 43UK6200PSA' agregado en el carrito de compras


  