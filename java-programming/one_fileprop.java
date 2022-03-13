import java.io.File;

public class one_fileProp {
    // print file properties
    public static void main(String[] args) {
        utils ob1 = new utils();
        ob1.getProperty("../secret.txt");
    }
}
class utils {
    void getProperty(String fileName) {
        // get file properties
        // print file properties
        File f = new File(fileName);
        System.out.println("File name    \t:" + f.getName());
        System.out.println("Absolute path\t: " + f.getAbsolutePath());
        System.out.println("Last modified\t:" + f.lastModified());
        System.out.println("File size    \t:" + f.length());

    }
}