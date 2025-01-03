public class Withclass{
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args){
    int[] arr = {10, 3, 4, 2, 5};
    int x = 3;
    int result = search(arr , x);
    System.out.println("index of array element: " + result);
}
}