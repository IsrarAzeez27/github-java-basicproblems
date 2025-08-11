import java.io.File;

public class FileSize {
    public static void main(String[] args) {

        // Display the file sizes in bytes for two files.
        System.out.println("/home/students/a.txt : " + new File("a.txt").length() + "bytes" );
        System.out.println("/home/students/b.txt : " + new File("b.txt").length() + "bytes" );
    }
}
