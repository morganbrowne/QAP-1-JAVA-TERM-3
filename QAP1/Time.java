package QAP1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    //Get Functions...
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int gerSecond() {
        return second;
    }


    //Set functions...
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    //setTime...
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // toString method to return time in "hh:mm:ss" format with leading zeros
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }



    //Advance time by one second... 
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
   
    
    //Decreace by one second...
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if  (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}
