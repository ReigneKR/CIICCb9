package Tasks.tasks121;

public class DateTask {
    // instance variables - made private
    private byte day;
    private byte month;
    private short year;

    // Constructors:
    // The no-args constructor
    public DateTask() {
        this(1, 1, 1); // Added as requested
    }

    // Constructor that takes 3 arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Methods
    public String toString() {
        return month + "/" + day + "/" + year; // Changed to "/" format
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            year = (short) y;
            month = (byte) m;
        } else {
            day = (byte) 0;
            year = (short) 0;
            month = (byte) 0;
        }
    }

    public static void leapYears() {
        for (int i = 1980; i <= 2023; i = i + 4) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
                System.out.println("The year " + i + " is a leap year");
        }
    }

    public int getDay() {
        return day; // Added return statement
    }

    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        } else {
            this.day = (byte) 0; // Added return 0 if condition is false
        }
    }

    public int getMonth() {
        return month; // Added return statement
    }

    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
        } else {
            this.month = (byte) 0; // Return 0 if condition is false
        }
    }

    public int getYear() {
        return year; // Added return statement
    }

    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
        } else {
            this.year = (short) 0; // Return 0 if condition is false
        }
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }
}