package Day4;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor overloading
    public Time(int hour, int minute){
        this(hour, minute, 0);
    }
    public Time(int hour){
        this(hour, 0);
    }
    public Time(){
        this(0);
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean isInvalidSecond = second < 0 || second > 59;
        if (isInvalidSecond) throw new IllegalArgumentException("Second should be between 0 and 59");
    }

    private static void validateMinute(int minute) {
        boolean isInvalidMinute = minute < 0 || minute > 59;
        if (isInvalidMinute) throw new IllegalArgumentException("Minute should be between 0 and 59");
    }

    private static void validateHour(int hour) {
        boolean isInvalidHour = hour < 0 || hour > 23;
        if (isInvalidHour) throw new IllegalArgumentException("Hour should be between 0 and 23");
    }
    
    
}
