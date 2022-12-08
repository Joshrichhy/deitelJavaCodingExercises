package chapterFive;

public class DifferentTriangleShape {
    public static void main(String[] args) {
        int blank = 6;
        for(int i = 1; i <= 6; i++){
            for (int k = 1; k <= i; k++){
            System.out.print(k);
        }
            System.out.println();
    }
        System.out.println();
        for(int i = 6; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();

            }


        for(int i = 1; i <= 6; i++) {

            for (int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
            blank--;

        }

        for(int i = 6; i >= 6; i--) {

            for (int j = 1; j <= blank; j++) {
                System.out.print(j);
            }

            System.out.println();


        }

        blank = 6;
        for(int i = 0; i <= 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= blank; j++) {
                System.out.print(j);
            }


            System.out.println();
            blank--;

        }

        }
}
