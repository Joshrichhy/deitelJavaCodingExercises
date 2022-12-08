package chapterSix.coinTossExercise;

import chapterSix.CoinTossGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class coinTossing {
private static CoinTossGame game = new CoinTossGame();
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
      System.out.println(CoinTossGame.getGameMenu());
        int userInput = input.nextInt();
        do {

            switch(userInput){
                case 1 -> game.flip();

                case 2-> goodbye();



            }
            System.out.println(CoinTossGame.getGameMenu());
            userInput = input.nextInt();

        }while(userInput > 0 && userInput < 3);




    }

    private static void goodbye() throws InterruptedException {
        displayGoodbye();
        System.out.print("Shutting down");
        for (int counter = 0; counter < 5 ; counter++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            System.exit(0);

        }
    }
    private static void displayGoodbye(){
        game.dispalyGameResult();
    }
}
