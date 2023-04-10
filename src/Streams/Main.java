package Streams;
import java.util.*;

import static Streams.Genders.*;

public class Main {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Lemon");

        Collections.sort(colors);
        System.out.println(colors.get(Collections.binarySearch(colors, "Green")));
        System.out.println(colors);

       List <Person> people = getPeople();

people.forEach(System.out::println);

                people.stream()
                .filter(person -> person.getGender().equals(Genders.FEMALE))
                .forEach(System.out::println);

        System.out.println();
                people.stream()
                        .sorted(Comparator.comparing(Person::getAge))
                        .forEach(System.out::println);

        System.out.println();
        people.stream()
                        .filter(person -> person.getAge() < 30)
                        .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                        .forEach(System.out::println);
    }
    private static List<Person> getPeople(){
        return List.of(
                new Person("Pauline", 24, FEMALE),
                new Person("Madam Ugo", 36, FEMALE),
                 new Person("Josh", 28, Genders.MALE),
                 new Person("Yinka", 26, Genders.NON_BINARY)
                );
    }
}
