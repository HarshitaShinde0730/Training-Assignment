import java.util.*;
import java.util.function.*;
public class Prob4 {
    public static void main(String[] args){
        Predicate<Integer> isEven =a -> a%2==0;
        System.out.println("Num is even: "+ isEven.test(4));
        System.out.println("Num is even: "+ isEven.test(9));
        Predicate<String> isWordStartigwithH = x -> x.toLowerCase().startsWith("h");
        Predicate<String> isWordEndingwithE = x -> x.toLowerCase().startsWith("e");
        Predicate<String> end = isWordStartigwithH.and(isWordEndingwithE);
        System.out.println(isWordStartigwithH.test("HarshitaShinde"));
    }
}