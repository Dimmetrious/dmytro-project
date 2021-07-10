package pageObject.selenide.ctco;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VacanciesPage {
    private final SelenideElement listOfVacancies = $x("//ul[@id='menu-main-1']"),
            activeClass = $x("//div[contains(@class,'active')]");


    public VacancyPage getIntoVacancy(String vacancy) {
        listOfVacancies.shouldBe(Condition.visible)
                .$x(".//a[contains(text(),'" + vacancy + "')]").hover().click();
        activeClass.$x(".//h1[contains(text(),'" + vacancy + "')]").shouldBe(Condition.visible);
        return new VacancyPage();
    }
}
