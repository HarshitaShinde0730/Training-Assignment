import java.util.function.*;
public class Prob8 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printNameAndAge = (name, age) ->
                System.out.println("Name: " + name + ", Age: " + age);
        printNameAndAge.accept("Atharv", 21);
        Consumer<String> greetUser = name ->
                System.out.println("Hello, " + name + "!");
        greetUser.accept("Atharv");
    }
}
