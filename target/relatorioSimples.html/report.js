$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#enconding utf-8"
    }
  ],
  "line": 2,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1686155000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": ": Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;:-consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "pesquisa por \"Ovo\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Exibe a expressao \"Ovo\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 6371083800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo",
      "offset": 14
    }
  ],
  "location": "Post.pesquisaPor(String)"
});
formatter.result({
  "duration": 2481894800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 5375300,
  "status": "passed"
});
formatter.after({
  "duration": 596351000,
  "status": "passed"
});
});