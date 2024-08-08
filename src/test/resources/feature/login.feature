# language: pt

Funcionalidade: Login

  Contexto:
    Dado que acesso a url do sistema Bug bank

  @test
  Cenário: Validar login com dados válidos
    Dado que eu esteja na página de login
    E que preencho o campo email e o campo senha com dados fixos
    Quando eu clicar no botão de login
    Então realizo o logout
    E finalizo o teste

  @test
  Cenario: Validar login com dados inválidos
    Dado que preencho o campo email e o campo senha com dados inválidos
    Quando eu clicar no botão de login
    Então devo validar a mensagem de erro na tela de login
    E finalizo o teste