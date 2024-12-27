import java.time.LocalDate;
public class Local1 {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate past = today.minusMonths(200);
        LocalDate today1 = today.plusMonths(200);
        System.out.println(today);
        System.out.println(yesterday);
        System.out.println(past);
        System.out.println(today1);
        if(today.isAfter(yesterday))
        {
            System.out.println("yes");
        }
    }
}
