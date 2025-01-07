public class HashCode{
    public static void main(String[] args){
        Cycle cycle1 = new Cycle(10 , "Green");
        Cycle cycle2 = new Cycle(20 , "Green");
        System.out.println(cycle1.equals(cycle2));
        System.out.println(cycle1);
        System.out.println(cycle2);
    }
}
class Cycle {
    int price;
    String  color;
    public Cycle(int price , String color){
        this.price = price;
        this.color = color;
    }

}