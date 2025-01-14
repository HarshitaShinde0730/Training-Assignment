import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Prob2 {
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
        }
    public static void main(String[] args){
        MathOperation addition =(a,b) -> a+b;
        System.out.println("Addition:" + addition.operate(10 , 5));
        MathOperation sub = (a,b) -> a-b;
        System.out.println("Sub:" + sub.operate(10 , 5));
        MathOperation mult =(a,b) -> a*b;
        System.out.println("Multiplication:" + mult.operate(10 , 5));
    }
}