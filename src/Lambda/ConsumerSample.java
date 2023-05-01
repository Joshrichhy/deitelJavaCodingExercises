package Lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println(name);
        Consumer<String> after = name -> System.out.println("Name is "+ name);

        Consumer <String> andThen = consumer.andThen(after);
        andThen.accept("Joshua");


        BiConsumer<String, Integer> biConsumer  = (name, age) -> System.out.println(name + " " + age);
        biConsumer.accept("Josh", 88);
    }
}
