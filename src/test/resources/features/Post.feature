  #enconding utf-8
  Feature: Consulta
  Scenario: : Consultar Ovo de Pascoa
      Given que acesso a Wikipedia em Portugues
      When pesquisa por "Ovo"
      Then Exibe a expressao "Ovo" no titulo da guia



