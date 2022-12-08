package tdd;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour >=0 && hour <=23 ) {this.hour = hour;}
        else {this.hour = 0;}
        //this.hour = hour;
        if (minute >= 0 && minute <= 59) {this.minute = minute;}
        else {hour +=  1;}
        //this.minute = minute;
        if (second >= 0 && second <= 59) {this.second = second;}
        else { minute  += 1;}
        //this.second = second;
    }

    public void setHour(int hour) {

        if (hour >=1 && hour <=23 ) {this.hour = hour;}
        else {this.hour = 0;}
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {this.minute = minute;}
        else {hour +=  1;}
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {this.second = second;}
        else { minute  += 1;}
    }

    public void displayTime() {
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());

    }

   // public int getdisplay() {
      //return hour:minute:second;
   // }


}

