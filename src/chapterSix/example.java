package chapterSix;

public class example {
    public static void main(String[] args) {
        printNumberAsIntegers(5);
        printNumberAsIntegers(7.2);
        printNumberAsIntegers("50");


    }
    private static void printNumberAsIntegers(int number){
        System.out.println(number);
    }
    private static void printNumberAsIntegers(double number){
        String[] s = String.valueOf(number).split("\\.");
        System.out.println(Integer.parseInt(s[0]));
    }
    private static void printNumberAsIntegers(String number){
        System.out.println(Integer.parseInt(number));
    }
}
