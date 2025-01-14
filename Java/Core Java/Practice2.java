import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Practice2{
    public static void main(String[] args){
        try{
            File myfile = new File("Stundent_info.txt");
            Scanner myreader = new Scanner(myfile);
            System.out.println("Contain of file:");
            while (myreader.hasNextLine()) {
                String line = myreader.nextLine();
                System.out.println(line);
            }

            myreader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
