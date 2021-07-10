package datePicker;

public class ExpectedDateObject {
    private final String year;
    private final String month;
    private final String day;

    public static class Builder {
        private String year;
        private String month;
        private String day;

        public Builder() {
        }

        public ExpectedDateObject.Builder year(String value) {
            year = value;
            return this;
        }

        public ExpectedDateObject.Builder month(String value) {
            month = value;
            return this;
        }

        public ExpectedDateObject.Builder day(String value) {
            day = value;
            return this;
        }

        public ExpectedDateObject build() {
            return new ExpectedDateObject(this);
        }
    }

    private ExpectedDateObject(ExpectedDateObject.Builder builder) {
        year = builder.year;
        month = builder.month;
        day = builder.day;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "ExpectedDateObject{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
