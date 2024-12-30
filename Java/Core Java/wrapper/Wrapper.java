import java.util.Scanner;
class Wrapper{
    public static void main(String[] args){
        String str = "1234";
        System.out.println(str);
        Integer ob = Integer.valueOf(str);
        int cd = ob * 5;
        int dc =  ob + 5;
        System.out.println(ob);
        System.out.println(cd);
        System.out.println(dc);
    }
}