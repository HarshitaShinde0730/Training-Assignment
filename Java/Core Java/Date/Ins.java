import java.time.Instant;
public class Ins {
    public static void main(String[] args){
        long currenttimemillis = System.currentTimeMillis();
        Instant now = Instant.now();
        System.out.println(currenttimemillis);
        System.out.println(now);
    }
}