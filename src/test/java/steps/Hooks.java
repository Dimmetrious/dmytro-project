package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Hooks {

    @Before()
    public void before(Scenario scenario) {
        String splitter = " ==================== ";
        System.out.println("\n" + splitter + scenario.getName() + splitter + "\n");
    }

    @After
    public void teardown() {
        closeWebDriver();
    }
}
