public class Str3 {
    public static void main (String[] args){
        StringBuffer sb = new StringBuffer("Harshita");
        StringBuilder sb1 = new StringBuilder("Hello world");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb.append("Shinde"));
        System.out.println(sb1.append("Shinde"));
        System.out.println(sb.reverse());
        System.out.println(sb1.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());
        System.out.println(sb.substring(7 , 13));
        System.out.println(sb1.substring(7 , 13));
    }
}