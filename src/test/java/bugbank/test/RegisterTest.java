package bugbank.test;

import bugbank.dto.RegisterDTO;
import bugbank.factory.data.RegisterData;
import bugbank.page.RegisterPage;
import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegisterTest {
    RegisterPage registerPage = new RegisterPage();
    RegisterData registerData = new RegisterData();

    @Dado("^que eu esteja na página de registro$")
    public void queEuEstejaNaPaginaDeRegistro() {
        registerPage.verifyHomePage();
    }

    @E("^clico no botão de se cadastrar$")
    public void clicoNoBotaoDeSeCadastrar() {
        registerPage.clickRegisterBtn();
    }

    @E("^preencho o formulário de registro com dados válidos$")
    public void preenchoOFormularioDeRegistroComDadosValidos() {
        RegisterDTO registerDTO = registerData.registerValidData();
        registerPage.fillTheRegisterForm(registerDTO.getEmail(), registerDTO.getFullName(), registerDTO.getPassword(), registerDTO.getConfirm_password());
        registerPage.clickIsAccountWithBalance();
    }

    @E("^preencho todos os campos com excecao do confirmar senha$")
    public void preenchoTodosOsCamposComExcecaoDoConfirmarSenha() {
        RegisterDTO registerDTO = registerData.registerValidData();
        registerPage.fillTheRegisterForm(registerDTO.getEmail(), registerDTO.getFullName(), registerDTO.getPassword(), "naoEAMesmaSenha");
    }

    @Quando("^eu clicar no botão cadastrar$")
    public void selecionoOBotaoCadastrar() {
        registerPage.clickRegisterSubmitBtn();
    }

    @Entao("devo validar a mensagem de sucesso na tela de cadastro")
    public void devoValidarAMensagemDeSucessoNaTelaDeCadastro() {
        var msgm = registerPage.verifyModalMessage();
        assertTrue(msgm.matches("A conta" + ".*" + "foi criada com sucesso!"));
        registerPage.clickModalCloseBtn();
    }

    @Entao("^devo validar a mensagem de erro na tela de cadastro$")
    public void devoValidarAMensagemDeErroNaTelaDeCadastro() {
        var msgm = registerPage.verifyModalMessage();
        assertEquals("As senhas não são iguais.", msgm);
        registerPage.clickModalCloseBtn();
    }
}
