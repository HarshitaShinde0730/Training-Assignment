import java.util.Scanner;
class Parse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        String str = sc.nextLine();
        System.out.println("Enter a value " + str);
        try{
            int num = Integer.parseInt(str);
            System.out.println("valid");
        }
        catch (NumberFormatException e){
            System.out.println("Invaild");
        }
    }
}