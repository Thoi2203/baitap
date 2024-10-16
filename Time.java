package baitap11;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;

    }
    public int getSecond() {
        return second;

    }
    public void setHour(int hour) {
        this.hour = hour;

    }
    public void setMinute(int minute) {
        this.minute = minute;

    }
    public void setSecond(int second) {
        this.second = second;

    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }
    public String toString() {
        return "Time [hour:" + hour + ", minute:" + minute + ", second:" + second + "]";

    }
    public Time nextSecond() {
        return new Time(getHour(), getMinute(), getSecond());

    }
    public Time previousSecond() {
        return new Time(getHour(), getMinute(), getSecond() + 1);

    }
}
