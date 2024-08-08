# language: pt

Funcionalidade: Cadastro

  Contexto:
    Dado que acesso a url do sistema Bug bank

  @test
  Cenário: Validar cadastro com dados válidos
    Dado que eu esteja na página de registro
    E clico no botão de se cadastrar
    E preencho o formulário de registro com dados válidos
    Quando eu clicar no botão cadastrar
#    Então devo validar a mensagem de sucesso na tela de cadastro
    E finalizo o teste

  @test
  Cenário: Validar cadastro com confirmar senha inválido
    Dado que eu esteja na página de registro
    E clico no botão de se cadastrar
    E preencho todos os campos com excecao do confirmar senha
    Quando eu clicar no botão cadastrar
#    Então devo validar a mensagem de erro na tela de cadastro
    E finalizo o teste