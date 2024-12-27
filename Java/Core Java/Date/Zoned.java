import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Zoned {
    public static void main(String[] args){
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime newy = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(now);
        System.out.println(newy);
    }
}