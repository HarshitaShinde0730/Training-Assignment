import java.time.LocalDate;
public class Local {
    public static void main(String[] args){
         LocalDate now = LocalDate.now();
         LocalDate custom = LocalDate.of(2003,07,30);
         int day = custom.getDayOfMonth();
         int year = custom.getYear();
         System.out.println(now);
         System.out.println(custom);
         System.out.println(day);
         System.out.println(year);
    }
}
