import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Comparator1 {
    public static void main(String[] args){
        List<Integer>array = new ArrayList<>();
        array.add(28);
        array.add(14);
        array.add(69);
        array.add(10);
        array.add(23);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return (num1 % 10) - (num2 % 10);
            }
        });
        System.out.println(array);
    }
}