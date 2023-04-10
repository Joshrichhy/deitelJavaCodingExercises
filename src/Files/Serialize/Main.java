package Files.Serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("dog"))) {
            Dog aja = new Dog("lucky", 45);
            objectOutputStream.writeObject(aja);
        }
        catch (IOException | SecurityException exception){
          exception.printStackTrace();
        }

    try(ObjectInputStream objectInputStream = new ObjectInputStream(
            new FileInputStream("C:\\Users\\USER\\IdeaProjects\\cohortFourteen\\dog"))){
        Dog newDog = (Dog) objectInputStream.readObject();
        System.out.println(newDog.toString());
    } catch (IOException | SecurityException | ClassNotFoundException e) {
      e.printStackTrace();
        }

    }
}
