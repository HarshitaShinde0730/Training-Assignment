import java.util.stream.*;
import java.util.*;
public class Prob1 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream = names.stream();
        stream.filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}