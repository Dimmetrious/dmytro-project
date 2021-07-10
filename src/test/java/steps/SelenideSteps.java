package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.selenide.ctco.MainPage;
import pageObject.selenide.ctco.VacancyPage;
import remoteWebDriver.SelenideRemoteDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideSteps {
    private VacancyPage vacancyPage;

    @Given("I setup {string} browser")
    public void iSetupBrowser(String browser) {
        SelenideRemoteDriver.setupSelenide(browser);
    }


    @When("I navigate to {string} url")
    public void iNavigateToUrl(String url) {
        open(url);
    }


    @And("I open vacancy with title {string}")
    public void iOpenVacancyWithTitle(String vacancy) {
        vacancyPage = new MainPage()
                .openCareersMenu()
                .openVacanciesPage()
                .getIntoVacancy(vacancy);
        assertThat(title()).isEqualTo(vacancy + " | C.T.Co People");
    }

    /*
    Comparing expected list count that is taken from feature file to actual(from page)
     */

    @Then("I verify that paragraph under {string}: contains exactly {int} skills")
    public void iVerifyThatParagraphUnderContainsExactlySkills(String paragraphTitle, int numberOfSkills) {
        int numberOfSkillsOnPage = vacancyPage.getNumberOfSkillsFromPage(paragraphTitle);
        assertThat(numberOfSkills)
                .withFailMessage("Number of '" + paragraphTitle + "' on page does not match." +
                        "\n expected :  %1s" +
                        "\n actual : %2s", numberOfSkills, numberOfSkillsOnPage)
                .isEqualTo(numberOfSkillsOnPage);
    }
}
