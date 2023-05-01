package Lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = input -> input%2 ==0;
        System.out.println(predicate.test(5));

        Predicate<Integer> after = afterInput-> afterInput >= 5;
        Predicate<Integer> andOperation = predicate.and(after);
        System.out.println(andOperation.test(10));

        Predicate<Integer> afterFirstOperation = afterInput-> afterInput == 5;
        Predicate<Integer> orOperation = predicate.or(afterFirstOperation);
        System.out.println(orOperation.test(10));

        BiPredicate<String, Integer> biPredicate = (name, lengthOfName)-> name.length() == lengthOfName;
        System.out.println("Ans "+biPredicate.test("Josh", 6));
    }
}
