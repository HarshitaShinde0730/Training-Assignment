import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
    public static void main(String[] args){
        List<String>name = new ArrayList<>();
        name.add("Kareena");
        name.add("Hardik");
        name.add("Atharv");
        name.add("Ayushi");
        name.add("Lakshita");
        System.out.println(name);
        Collections.sort(name, (str1, str2) -> str1.compareTo(str2));
        System.out.println(name);
    }
}
