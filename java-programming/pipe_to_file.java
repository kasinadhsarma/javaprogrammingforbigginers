import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class pipe_to_file {
    public static void main(String[] args) {
        System.out.println("Starting....");
        File buffer1 = new File("file1.txt");
        try {
            Scanner input = new Scanner(buffer1);
            FileWriter buffer2 = new FileWriter("file2.txt");

            while (input.hasNextLine()) {
                buffer2.write(input.nextLine()+"\n");
            }

            input.close();
            buffer2.close();
        }
        catch (Exception e) {
            System.out.println("Error reading file");
        }
        System.out.println("Done!");
    }
}
