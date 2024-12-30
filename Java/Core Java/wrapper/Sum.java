import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = sc.nextInt();
        System.out.println(num);
        String numStr = num.toString();
        System.out.println("convert to string: " + num);
        int sum = 0;
        for (char digitChar : numStr.toCharArray()) {
            sum += Character.getNumericValue(digitChar);
        }
        System.out.println("Sum of the digits: " + sum);
    }
}