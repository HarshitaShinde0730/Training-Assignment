import java.util.*;
import java.util.stream.*;
public class Prob4 {
    public static void main(String[] args){
        List<Integer> mylist = Arrays.asList(1, 3,2,5,4,6,8,7,12,21,34,54,67,89,22,33,11,56,26,48,46,50,52,1, 3,2,5,4,6,8,7,12,21,34,54,67,89,22,33,11,56,26,48,46,50,52);
        List<Integer> filter2 = mylist.parallelStream()
                .filter(x -> x%2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a,b) -> (b - a))
                .limit(5)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(filter2);
    }
}