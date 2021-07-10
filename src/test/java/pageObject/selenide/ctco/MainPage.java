package pageObject.selenide.ctco;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement careersMenu = $("#menu-item-127"),
            vacanciesOption = careersMenu.$("#menu-item-131");


    public MainPage openCareersMenu() {
        careersMenu.shouldBe(Condition.visible).hover();
        return this;
    }

    public VacanciesPage openVacanciesPage() {
        vacanciesOption.shouldBe(Condition.visible).click();
        return new VacanciesPage();
    }
}
