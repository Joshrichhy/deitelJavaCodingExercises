package Files;

import java.io.*;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream =
                    new FileInputStream("C:\\Users\\USER\\IdeaProjects\\cohortFourteen\\src\\Files\\Test.txt")){
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte b:bytes ) {
                System.out.print(Character.toString(b));}}
        catch (IOException exception){
            System.err.println(exception.getMessage());}

        try(var fileOutputStream =
                    new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\cohortFourteen\\src\\Files\\Test_output.txt")){
            byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
            fileOutputStream.write(bytes);

            }
        catch (IOException exception){
            System.err.println(exception.getMessage());}

        char [] chars = new char[20];
        try(FileReader fileReader = new FileReader("C:\\Users\\USER\\IdeaProjects\\cohortFourteen\\src\\Files\\Test.txt")){
            var numberOfCharactersRead = fileReader.read(chars);
            System.out.println();
            System.out.println(numberOfCharactersRead);
            System.out.println(Arrays.toString(chars));
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }



        try(FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\IdeaProjects\\cohortFourteen\\src\\Files\\Test.txt", true)){
            fileWriter.append("I am going home");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
