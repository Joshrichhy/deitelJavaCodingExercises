package chapterSix;

import chapterSix.coinTossExercise.Coin;

import java.security.SecureRandom;

public class CoinTossGame {
    private int headCount;
    private int tailCount;
    private Coin coin;
    public static String getGameMenu() {
        return """
                1. Toss Coin
                2. Exit Game
                """;
    }

    public String flip() {
        int randomNumber = generateRandomNumberBetweenZeroAndOne();
        if (randomNumber == 0) {headCount++;
            return Coin.HEADS.name();}
            tailCount++;
        return Coin.TAILS.name();
        }


    private static int generateRandomNumberBetweenZeroAndOne() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }

    public int getHeadCount() {
        return headCount;
    }

    public int getTailCount() {
        return tailCount;
    }
    public void dispalyGameResult(){
        int totalFlip = headCount + tailCount;
        System.out.printf("Total Head Count is %d%n" + "Total Tail Count is %d%n" + "Total Time Played %d%n", headCount,
                tailCount, totalFlip);
    }
}
