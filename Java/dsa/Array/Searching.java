public class Searching {
    public static void main(String[] args){
        int[] arr = {10, 3, 4, 2, 5};
        int x = 3;
        // return the index of x in given array
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            if(arr[i]==x){
                System.out.println(i);
            }
        }
    }
}