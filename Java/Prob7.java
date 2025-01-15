import java.util.*;
import java.util.function.*;
public class Prob7 {
    public static void main(String[] args){
        Consumer<String> name = s -> System.out.println("Input:"+ s);
        name.accept("Atharv");
    }
}