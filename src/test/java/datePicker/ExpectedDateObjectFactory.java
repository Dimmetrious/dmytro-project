package datePicker;

public class ExpectedDateObjectFactory {

    public static ExpectedDateObject getExpectedDateObject(InputDateObject inputDateObject) {
        DatePickerHelper datePickerHelper = new DatePickerHelper();
        if (onlyYear(inputDateObject)) return datePickerHelper.getExpectedObject(inputDateObject.getYear());
        if (notAplicable(inputDateObject)) throw new IllegalArgumentException("Not aplicable values are entered");
        return datePickerHelper.getExpectedObject(inputDateObject.getYear(), inputDateObject.getMonth() - 1);
    }


    private static boolean onlyYear(InputDateObject inputDateObject) {
        return inputDateObject.getMonth() == 0;
    }

    private static boolean notAplicable(InputDateObject inputDateObject) {
        return inputDateObject.getYear() == 0 || inputDateObject.getMonth() == 0;
    }
}
