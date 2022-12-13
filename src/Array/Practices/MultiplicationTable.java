package Array.Practices;

public class MultiplicationTable {
    public static void main(String[] args) {
        int [] EvenNumbers = new int[13];
        System.out.printf("%s%10s%n", "Number",  "Answer");

        for (int count = 0; count < EvenNumbers.length; count++) {
            EvenNumbers[count] = 2 + 2 * count;
            System.out.printf("%d%10d%n", count, EvenNumbers[count]);

        }

        int GradeBook [] = {24, 32,67,32,78,90,76,54,33,21,54};
        int Sum = 0;
        for (int count = 0; count < GradeBook.length; count++) {
            Sum += GradeBook[count];
        }
        int average = Sum/GradeBook.length;
        System.out.printf("%d%n%d", Sum, average);
    }
}
