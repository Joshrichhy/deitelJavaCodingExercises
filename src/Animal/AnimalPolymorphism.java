package Animal;

public class AnimalPolymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Lion lion = new Lion();
        Animal animal = new Lion();
        Animal animalDog = new Dog();
        Dog dogLion = new Lion();


        String x = "728674267";
        String y = "4267";
       if( x.regionMatches(5, y, 0, 4)) System.out.println("A match");


    }
}
