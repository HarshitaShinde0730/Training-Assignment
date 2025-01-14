import java.util.*;
import java.util.function.*;
import java.util.ArrayList;
public class Prob3 {
    public static void main(String[] args){
        List<String> name = Arrays.asList("ABC","JKL","MNO","DEF","GHI","STU","VWX","YZ","PQR","STU");
        Collections.sort(name, (a,b) -> a.compareTo(b));
        System.out.println("sort:"+ name);
        Collections.sort(name, (a,b) -> b.compareTo(a));
        System.out.println("sort:"+ name);
        System.out.println("Iterating with forEach:");
        name.forEach(names -> System.out.println(names));
    }
}