import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            File file = new File("Data.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File Already Exists: " + file.getName());
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Writing inside the file using write function in Java.");
                System.out.println("Write Successful");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
