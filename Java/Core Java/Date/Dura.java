import java.time.Duration;
import java.time.Instant;
public class Dura {
    public static void main(String[] args){
        Instant end  = Instant.now();
        Instant start = Instant.now();
        Duration duration = Duration.between (start , end);
        System.out.println(duration);
    }
}