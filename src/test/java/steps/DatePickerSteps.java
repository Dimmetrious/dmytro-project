package steps;

import datePicker.ExpectedDateObject;
import datePicker.ExpectedDateObjectFactory;
import datePicker.InputDateObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class DatePickerSteps {
    private ExpectedDateObject expectedDateObject;
    private InputDateObject inputDateObject = new InputDateObject();

    @When("User enters {int} into year field")
    public void userEntersIntoYearField(int yearValue) {
        assertThat(String.valueOf(yearValue).length()).isEqualTo(4);
        inputDateObject.setYear(yearValue);
    }

    @And("User enters {int} into month field")
    public void userEntersIntoMonthField(int monthValue) {
        assertThat(monthValue > 0 && monthValue <= 12)
                .withFailMessage("Month's value should be from 1 to 12")
                .isTrue();
        inputDateObject.setMonth(monthValue);
    }


    @And("User submits date")
    public void userSubmitsDate() {
        while (inputDateObject.getMap().values().remove(0)) ;
        Assertions.assertThat(inputDateObject.getMap().isEmpty())
                .withFailMessage("Input Date values are empty")
                .isFalse();

        expectedDateObject = ExpectedDateObjectFactory.getExpectedDateObject(inputDateObject);
        System.out.println(inputDateObject.toString());
        System.out.println(expectedDateObject.toString());
    }

    /*
    At this step comparing between expected and actual should be done;
    We already have expected result,so actual should be taken and compared
     */

    @Then("User compares actual result with expected")
    public void userComparesActualResultWithExpected() {
        System.out.println("\n\t - Here should be assertion with expected and actual");
    }

}
