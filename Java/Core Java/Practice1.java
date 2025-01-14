import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Practice1 {
    public static void main(String[] args){
        File file = new File("Stundent_info.csv");
        try{
            if(file.createNewFile()){
                System.out.println("File Created" + file.getName());
            }
            else{
                System.out.println("File Not Created");
            }
            try(FileWriter writer = new FileWriter(file)){
                writer.write("Name : John Doe, " +
                        "Age : 20," +
                        "Course: CSE");
            }
        }
        catch (IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}