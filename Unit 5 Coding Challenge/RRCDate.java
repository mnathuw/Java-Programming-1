/**
 * int year, month,day
 * defaul: Oct 1,1582
 * year: 4 digit > 1581 invalid -> default
 * return month as aString June ->6 (getLongMonth)
 * toString
 */

import java.text.SimpleDateFormat;

public class RRCDate {
    private int month, day, year;

    private String monthString(int inputMonth) {
        switch (inputMonth) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "unidentified";
    }

    public RRCDate() {
        this(10, 1, 1582);
    }

    public RRCDate(int month, int day, int year) {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 10;
        }
    }

    public void setDay(int day) {
        if (day <= 31 && day >= 1) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public void setYear(int year) {
        if (year >= 1582 && year <= 9999) {
            this.year = year;
        } else {
            this.year = 1582;
        }
    }

    public String getLongMonth() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public String getLongFormat() {
        return monthString(this.month) + " " + this.day + ", " + this.year;
    }

    public Boolean isLeapYear() {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RRCDate))
            return false;
        else {
            RRCDate objRRCDate = (RRCDate) o;
            if (this.month == objRRCDate.month
                    && this.day == objRRCDate.day
                    && this.year == objRRCDate.year)
                return true;
            else
                return false;
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}





