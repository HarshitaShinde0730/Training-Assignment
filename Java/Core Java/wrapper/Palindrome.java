import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        Integer num = sc.nextInt();
        System.out.println("integer: " + num);
        String numstr = num.toString();
        System.out.println("string: " + num);
        String str = new StringBuilder(numstr).reverse().toString();
        if(numstr.equals(str)){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
}