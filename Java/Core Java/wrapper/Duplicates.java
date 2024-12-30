import java.util.HashMap;
import java.util.Scanner;
public class Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = sc.nextInt();
        String numberStr = num.toString();
        System.out.println("Converted to String: " + numberStr);
        HashMap<Character, Integer> numberfrequency = new HashMap<>();
        for (char digit : numberStr.toCharArray()) {
            numberfrequency.put(digit, numberfrequency.getOrDefault(digit, 0) + 1);
        }
        System.out.println("number Frequencies:");
        for (Character key : numberfrequency.keySet()) {
            System.out.println("Digit " + key + ": " + numberfrequency.get(key));
        }
    }
}