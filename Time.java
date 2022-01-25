public class Time {   
    private int hour, minute;   
   
    public Time () {   
        hour = 12;   
        minute = 0;   
    }   
       
    public void setHour(int h) {   
        hour = h;   
    }   
       
    public int getHour() {   
        return hour;   
    }   
       
    public void setMinute(int m) { 
        minute = m;   
    }   
       
    public int getMinute() {   
        return minute;   
    }   
   
    public void showTime() {   
        System.out.println("Time is: " + hour + ":" + minute);   
    }   

    public long getTimeMillis() {
        return System.currentTimeMillis();
    }

    public long getTotalSeconds() {
        return getTimeMillis() / 1000;
    }

    public long getCurrentSecond() {
        return getTotalSeconds() % 60;
    }

    public long getTotalMinutes() {
        return getTotalSeconds() / 60;
    }

    public long getCurrentMinute() {
        return getTotalMinutes() % 60;
    }

    public long getTotalHours() {
        return  getTotalMinutes() / 60;
    }

    public long getCurrentHour() {
        return getTotalHours() % 24;
    }

    public void getTimeStamp() {
        System.out.println( "Current time is " + String.format("%02d", getCurrentHour()) + ":" + String.format("%02d", getCurrentMinute()) + ":" + String.format("%02d", getCurrentSecond()) + " GMT");
    }
}
