package datePicker;

import java.util.HashMap;

public class InputDateObject {
    private HashMap<String, Integer> map = new HashMap<>();
    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        map.put("year", year);
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        map.put("month", month);
        this.month = month;
    }

    public HashMap<String, Integer> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "InputDateObject" + getMap();
    }

}
