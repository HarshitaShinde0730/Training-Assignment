import java.util.Scanner;
public class Arraypro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int size = sc.nextInt();
        Integer []array = new Integer[size];
        System.out.println("Enter " + size + " array:");
        for(int i = 0; i< size; i++){
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length ; i++)
        {
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}