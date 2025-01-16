import java.util.*;
import java.util.stream.*;
public class Prob2 {
    public static void main(String[] args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> filter = mylist.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(filter);
        List<Integer> filter2 = filter.stream().filter(x -> x%2 == 0).map(x -> x/2).distinct().collect(Collectors.toList());
        System.out.println(filter2);
    }
}