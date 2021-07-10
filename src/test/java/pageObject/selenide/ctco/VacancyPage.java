package pageObject.selenide.ctco;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VacancyPage {

    private final SelenideElement activeClass = $x("//div[contains(@class,'active')]"),
            activePage = activeClass.$x(".//div[@class='wysiwyg wysiwyg-2']");
    private final ElementsCollection listOfAllBlocksOnPage = activePage.$$x("./child::*");


    public int getNumberOfSkillsFromPage(String paragraphTitle) {
        for (int i = 1; i < listOfAllBlocksOnPage.size() + 1; i++)
            if (listOfAllBlocksOnPage.get(i).$x(".//*[contains(text(),'" + paragraphTitle + "')]").isDisplayed())
                return listOfAllBlocksOnPage.get(i + 1).$$x(".//li").size();
        return 0;
    }
}
