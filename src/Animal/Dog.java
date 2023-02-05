package Animal;

public class Dog extends  Animal{

    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("I eat bones while eating");
    }
}
