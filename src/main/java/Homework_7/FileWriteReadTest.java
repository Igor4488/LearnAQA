package Homework_7;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteReadTest{
    public static void main(String[] args) {
        Path fp = Path.of("myfile.txt");
        Path fp2 = Path.of("./", "myfile2.txt");

        try {
            Path path = Files.writeString(fp, "Text line 1");
            Path path1 = Files.writeString(fp2, "Text line 3");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

