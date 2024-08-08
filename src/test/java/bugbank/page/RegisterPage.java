package bugbank.page;

import bugbank.dto.RegisterDTO;
import bugbank.factory.data.RegisterData;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private static final By homeText = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > h1");
    private static final By registerBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child");
    private static final By emailField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(2) > input");
    private static final By nameField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(3) > input");
    private static final By passwordField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(4) > div > input");
    private static final By passworldConfirmField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(5) > div > input");
    private static final By isAccountWithBalance = By.cssSelector("#toggleAddBalance");
    private static final By registerSubmitBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button");
    private static final By modalMessage = By.cssSelector("#modalText");
    private static final By modalCloseBtn = By.cssSelector("#btnCloseModal");

    public void verifyHomePage() {
        readText(homeText);
    }

    public void clickRegisterBtn() {
        click(registerBtn);
    }

    public void fillEmailField(String email) {
        fillInput(emailField, email);
    }

    public void fillNameField(String name) {
        fillInput(nameField, name);
    }

    public void fillPasswordField(String senha) {
        fillInput(passwordField, senha);
    }

    public void fillPassworldConfirmField(String senha) {
        fillInput(passworldConfirmField, senha);
    }

    public void clickIsAccountWithBalance() {
        click(isAccountWithBalance);
    }

    public void clickRegisterSubmitBtn() {
        click(registerSubmitBtn);
    }

    public String verifyModalMessage() {
        return readText(modalMessage);
    }

    public void clickModalCloseBtn() {
        clickWithWait(modalCloseBtn);
    }

    public void fillTheRegisterForm(String email, String name, String password, String passwordConfirm) {
        fillEmailField(email);
        fillNameField(name);
        fillPasswordField(password);
        fillPassworldConfirmField(passwordConfirm);
    }


    public RegisterDTO doRegisterAndGoToHomepage() {
        verifyHomePage();
        clickRegisterBtn();
        RegisterDTO registerDTO = RegisterData.registerValidData();
        fillTheRegisterForm(registerDTO.getEmail(), registerDTO.getFullName(), registerDTO.getPassword(), registerDTO.getConfirm_password());
        clickIsAccountWithBalance();
        clickRegisterSubmitBtn();
        clickModalCloseBtn();

        return registerDTO;
    }

    public RegisterDTO doRegisterAndGoToHomepageWithoutConfirmBalance() {
        verifyHomePage();
        clickRegisterBtn();
        RegisterDTO registerDTO = RegisterData.registerValidData();
        fillTheRegisterForm(registerDTO.getEmail(), registerDTO.getFullName(), registerDTO.getPassword(), registerDTO.getConfirm_password());
        clickRegisterSubmitBtn();
        clickModalCloseBtn();

        return registerDTO;
    }
}
