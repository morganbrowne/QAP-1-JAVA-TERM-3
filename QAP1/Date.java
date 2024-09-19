package QAP1;

public class Date {
    private int day;
    private int month;
    private int year;

    // COnstructor to initialize the day, month, and year...
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Get function...
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Set function... 
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public void setYear(int year) {
        this.year = year;
    }


    // Set all fields...
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

