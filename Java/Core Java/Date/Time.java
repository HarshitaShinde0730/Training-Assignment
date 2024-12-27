import java.time.LocalTime;
public class Time {
    public static void main(String[] args){
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime before = now.minusHours(100);
        int sec = now.getSecond();
        int min = now.getMinute();
        System.out.println(sec);
        System.out.println(min);
        System.out.println(before);
    }
}