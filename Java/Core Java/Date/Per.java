import java.time.LocalDate;
import java.time.Period;
public class Per {
    public static void main(String[] args){
        LocalDate end = LocalDate.now();
        LocalDate start = LocalDate.of(2003,07,30);
        Period per1 = Period.between(start , end);
        System.out.println(per1);
    }
}