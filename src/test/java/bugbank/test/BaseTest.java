package bugbank.test;

import bugbank.factory.service.SeleniumService;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class BaseTest extends SeleniumService {
    @Dado("^que acesso a url do sistema Bug bank$")
    public void queAcessoAUrlDoSistemaBugBank() {
        initBrowser();
    }

    @E("^finalizo o teste$")
    public void fecharNavegador() {
        tearDown();
    }
}