package chapterFive;

public class hypotenuse {
    public static void main(String[] args) {
        System.out.println("side 1  side 2    hypotenuse");

        for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse ++){
            for (int side1 = 1; side1 <= 500; side1 ++){
                for (int side2 = 1; side2 <= 500; side2 ++){

                    if (((hypotenuse * hypotenuse) == (side1 * side1) + (side2 * side2))){
                    System.out.printf("%d    |    %d     |     %d%n", side1,  side2,    hypotenuse);}
                }
            }
        }

    }

}
