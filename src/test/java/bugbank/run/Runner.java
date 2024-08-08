package bugbank.run;

import bugbank.util.ConfigProperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        dryRun = false,
        tags = "@test",
        glue = "bugbank/test",
        plugin = {
                "json:target/cucumber.json",
                "pretty",
                "html:target/cucumber-reports",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {
    @BeforeClass
    public static void BeforeClass() {
        ConfigProperties.initializePropertyFile();
    }

    @AfterClass
    public static void afterClass() {

    }
}