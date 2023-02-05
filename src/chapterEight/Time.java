package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds){
        validateTime(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public static void validateHour(int hour){
        try {
            boolean hourIValid =  hour < 0 || hour > 24;
            if(hourIValid) throw new IllegalArgumentException("invalid Hour");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            validateHour(hour);

        }

    }
    private static void validateMinute(int minute){
        boolean minuteIsValid =  minute < 0 || minute > 59;
        if(minuteIsValid) throw new IllegalArgumentException("invalid Minute");
    }
    private static void validateSeconds(int seconds){
        boolean secondIsValid =  seconds < 0 || seconds > 59;
        if(secondIsValid) throw new IllegalArgumentException("invalid seconds");
    }
    private static void validateTime(int hour, int minute, int seconds){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);
    }
}
