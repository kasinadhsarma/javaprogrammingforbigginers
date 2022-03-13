import java.io.File;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) {
        // read a file
        File buffer1 = new File("secret.txt");
        try {
            Scanner input = new Scanner(buffer1);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();
        }
        catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
