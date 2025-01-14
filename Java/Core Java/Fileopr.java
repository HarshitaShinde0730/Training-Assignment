import java.io.File;
import java.io.IOException;
public class Fileopr {
    public static void main(String[] args){
        File myfile = new File("example.txt");
        System.out.println("File Created:" + myfile.getName());
        System.out.println("File Path:" + myfile.getAbsolutePath());
    }
}