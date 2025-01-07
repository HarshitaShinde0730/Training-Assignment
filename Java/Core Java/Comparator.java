import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args){
      List<String>person = new ArrayList<String>();
      person.add("Param");
      person.add("Parnika");
      person.add("Priyanshee");
      person.add("Prachi");
      person.add("Shriya");
      person.add("Harshita");
      System.out.println(person);
      Collections.sort(person);
      System.out.println(person);
    }
}