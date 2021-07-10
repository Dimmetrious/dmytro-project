package steps;

import org.junit.After;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Hooks {

    @After
    public void teardown(){
        closeWebDriver();
    }
}
