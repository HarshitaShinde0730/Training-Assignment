import java.time.LocalDateTime;
public class Datetime {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now1 = LocalDateTime.of(2003, 07, 30 , 10, 53);
        System.out.println(now);
        System.out.println(now1);
    }
}