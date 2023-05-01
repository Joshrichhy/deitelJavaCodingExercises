package Lambda;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, Integer> function = (name)-> name.length();
        System.out.println(function.apply("Joshua"));

        Function<String, Integer> functionOne = (name)-> name.length();
        Function<Integer, Integer> functionTwo = (input)-> input * 2;

        Function<String, Integer> result = functionOne.andThen(functionTwo);
        System.out.println(result.apply(String.valueOf(10)));

    }
}
