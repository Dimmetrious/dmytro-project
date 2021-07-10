package datePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePickerHelper {

    public ExpectedDateObject getExpectedObject(int year) {
        Calendar calendar = Calendar.getInstance();
        int difference = getDifference(calendar.get(Calendar.YEAR), year);

        if (difference == 0) calendar.set(Calendar.DAY_OF_YEAR, getTodaysDayNumberFromBeginingOfYear() / 2);
        else if (difference == 1) calendar.set(year, Calendar.DECEMBER, 31);
        else calendar.set(year, Calendar.JUNE, 30);
        return getDateObject(calendar);
    }

    public ExpectedDateObject getExpectedObject(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        int yearDifference = getDifference(calendar.get(Calendar.YEAR), year);
        int monthDifference = getDifference(calendar.get(Calendar.MONTH), month);

        if (getDifference(yearDifference, monthDifference) != 0) calendar.set(year, month, 15);
        return getDateObject(calendar);
    }

    private ExpectedDateObject getDateObject(Calendar calendar) {
        return new ExpectedDateObject.Builder()
                .year(getCalendarValueByPattern(calendar.getTime(), "yyyy"))
                .month(getCalendarValueByPattern(calendar.getTime(), "MMMM"))
                .day(getCalendarValueByPattern(calendar.getTime(), "dd")).build();
    }

    private String getCalendarValueByPattern(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    private int getTodaysDayNumberFromBeginingOfYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_YEAR);
    }


    private int getDifference(int first, int second) {
        return Math.abs(first - second);
    }
}
