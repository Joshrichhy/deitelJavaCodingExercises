package Lambda;

public class Main {
    public static void main(String[] args) {
        CarMethod carMethod = ()-> "i want to stop";
        System.out.println(carMethod.stop());
    }
}
