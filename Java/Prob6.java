import java.util.*;
import java.util.function.*;
public class Prob6 {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> isSumGreaterThanTen = (a,b) ->(a+b)>10;
        System.out.println("graterthan10: "+ isSumGreaterThanTen.test(5,6));
    }
}