import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        try {
            File myfile = new File("Data.txt");
            Scanner read = new Scanner(myfile);
            int linecount = 0;
            int wordcount = 0;
            while(read.hasNextLine()){
                String line = read.nextLine();
                linecount++;
                String[] words = line.split("\\s+");
                wordcount += words.length;
                read.close();
                System.out.println("line count:" + linecount);
                System.out.println("word count:" + wordcount);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}