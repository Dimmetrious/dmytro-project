package pageObject.selenide.ctco;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement careersMenu = $("#menu-item-127"),
            vacanciesOption = careersMenu.$("#menu-item-131");

    /*
        Waiting for element to be visible and doing 'mouse over';
     */
    public MainPage openCareersMenu() {
        careersMenu.shouldBe(Condition.visible).hover();
        return this;
    }

    /*
        Waiting for element to be visible and clicking;
     */
    public VacanciesPage openVacanciesPage() {
        vacanciesOption.shouldBe(Condition.visible).click();
        return new VacanciesPage();
    }
}
