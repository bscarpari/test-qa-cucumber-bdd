package bugbank.test;

import bugbank.dto.LoginDto;
import bugbank.dto.RegisterDTO;
import bugbank.factory.data.LoginData;
import bugbank.factory.data.RegisterData;
import bugbank.page.LoginPage;
import bugbank.page.RegisterPage;
import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;

public class LoginTest {
    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();
    RegisterPage registerPage = new RegisterPage();

    @Dado("^que eu esteja na página de login$")
    public void queEuEstejaNaPaginaDeLogin() {
        loginPage.verifyHomePage();
    }

    @E("^que preencho o campo email e o campo senha com dados fixos")
    public void preenchoOFormularioDeLoginComDadosValidos() {
        // Rotina de cadastro anteriormente
        RegisterDTO registerDTO = registerPage.doRegisterAndGoToHomepage();
        loginPage.fillTheLoginForm(registerDTO.getEmail(), registerDTO.getPassword());
    }

    @E("^que preencho o campo email e o campo senha com dados inválidos$")
    public void preenchoOFormularioDeLoginComEmailInvalido() {
        RegisterDTO registerDTO = registerPage.doRegisterAndGoToHomepageWithoutConfirmBalance();
        loginPage.fillTheLoginForm(registerDTO.getEmail(), "senhaInvalida");
    }

    @Quando("^eu clicar no botão de login$")
    public void selecionoOBotaoLogin() {
        loginPage.clickLoginBtn();
    }

    @Então("^realizo o logout$")
    public void realizoOLogout() {
        loginPage.clickSignOutBtn();
    }

    // TODO: finalizar os testes das menagens de erro e sucesso
    @Então("devo validar a mensagem de erro na tela de login")
    public void devoValidarAMensagemDeErroNaTelaDeLogin() {
        var msgm = loginPage.returnModalMessage();
//        assertEquals("Usuário ou senha inválido.\n" + "Tente novamente ou verifique suas informações!", msgm);
        loginPage.clickModalCloseBtn();
    }

    @io.cucumber.java.pt.E("que preencho o campo email <email> e o campo senha <senha> com dados válidos")
    public void quePreenchoOCampoEmailEmailEOCampoSenhaSenhaComDadosVálidos() {
        LoginDto loginDto = loginData.loginWithValidFixedData();
        loginPage.fillTheLoginForm(loginDto.getEmail(), loginDto.getPassword());
    }
}