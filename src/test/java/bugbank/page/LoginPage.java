package bugbank.page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By homeText = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > h1");
    private static final By emailField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.style__ContainerFieldInput-sc-s3e9ea-0.gQAEIG.input__child > input");
    private static final By passwordField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__password > div > input");
    private static final By signInBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");
    private static final By signOutBtn = By.cssSelector("#btnExit");
    private static final By modalMessage = By.xpath("/html/body/div/div/div[3]/div/div[2]/p");
    private static final By modalCloseBtn = By.cssSelector("#btnCloseModal");

    public void fillEmailField(String email) {
        fillInput(emailField, email);
    }

    public void fillPasswordField(String password) {
        fillInput(passwordField, password);
    }

    public void verifyHomePage() {
        readText(homeText);
    }

    public void clickLoginBtn() {
        click(signInBtn);
    }

    public void clickSignOutBtn() {
        click(signOutBtn);
    }

    public String returnModalMessage() {
        return readText(modalMessage);
    }

    public void clickModalCloseBtn() {
        clickWithWait(modalCloseBtn);
    }

    public void fillTheLoginForm(String email, String password) {
        fillEmailField(email);
        fillPasswordField(password);
    }
}