package Files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args){
        Path path = Paths.get("a/b/c.java");
        Path path1 = Path.of("C:\\Users\\USER\\Desktop\\Database works");


        try ( DirectoryStream<Path> directoryStream=  Files.newDirectoryStream(path1)) {
          Iterator<Path> iterator = directoryStream.iterator();
          while (iterator.hasNext()){
              Path path2 = iterator.next();
              System.out.println(path2.getFileName());
          }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println("File name:: "+path.getFileName());
//        System.out.println("File System:: "+path.getFileSystem());
//        System.out.println("File Parent:: "+path.getParent());
//        System.out.println("File Root:: "+path.getRoot());
//        System.out.println(path.endsWith("d" + "/c.java"));
//
//        Path path1 = Paths.get("a/b/c/../..");
//        System.out.println("File normal Path" +
//                "" +
//                ":: "+path1.normalize());
    }
}
