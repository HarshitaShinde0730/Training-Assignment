import java.util.*;
import java.util.function.*;
public class Prob5 {
    public static void main(String[] args){
            Function<Integer,Integer> doubleIt = a -> 2 * a;
            Function<Integer, Integer> squareIt = a -> a*a;
            System.out.println("doubleIt: "+doubleIt.apply(100));
            System.out.println("squareIt: "+squareIt.apply(100));
            System.out.println(doubleIt.andThen(squareIt).apply(100));
    }
}