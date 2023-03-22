package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            Path path = Path.of("C:\\Users\\USER\\Desktop\\FilesCreation"+"\\"+args[i]+".java");
            try {
                Files.createFile(path);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
