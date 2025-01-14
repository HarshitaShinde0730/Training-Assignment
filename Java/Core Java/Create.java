import java.io.File;
import java.io.IOException;
public class Create {
    public static void main(String[] args){
        File file = new File("data.csv");
        try{
            if(file.createNewFile()){
                System.out.println("File Created:"+ file.getName());
            }
            else{
                System.out.println("File Already exits:");
            }
        }
        catch(IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
        System.out.println("File Path:" + file.getAbsolutePath());
    }
}