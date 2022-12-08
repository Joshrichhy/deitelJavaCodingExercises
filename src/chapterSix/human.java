package chapterSix;

public class human {
    public static void main(String[] args) {
        Person person = new Person("John", 18, Gender.MALE);
        Person person1 = new Person("John Doe", 18, Gender.MALE);
        Person person2 = new Person("Jane Doe", 18, Gender.FEMALE);
        Person person3 = new Person("John Doe", 18, Gender.NONBINARY);

        int numberOfMales = countMales(person, person1, person2, person3);
        System.out.println(numberOfMales);
    }
    private static int countMales(Person... people){
        int counter = 0;
        for (int i = 0; i < people.length; i++){
            if (people[i].getGender() == Gender.MALE) counter++;
        }
        return counter;
    }
}
