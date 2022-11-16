package tdd;

public class Driller {


    public int price(int numbers, int amount) {
        int amount1 = 2000;
        int amount2 = 1800;
        int amount3 = 1600;
        int amount4 = 1500;
        int amount5 = 1300;
        int amount6 = 1200;
        int amount7 = 1100;
        int amount8 = 1000;

        if (numbers >= 1) {
            amount = amount1 * numbers;
        }
        if (numbers >= 5 ) {
                amount = amount2 * numbers;
            }
        if (numbers >= 10 ) {
            amount = amount3 * numbers;
        } if (numbers >= 30 ) {
            amount = amount4 * numbers;
        }if (numbers >= 50 ) {
            amount = amount5 * numbers;
        }if (numbers >= 100 ) {
            amount = amount6 * numbers;
        }if (numbers >= 200 ) {
            amount = amount7 * numbers;
        }if (numbers >= 500 ) {
            amount = amount8 * numbers;
        }
                return amount;
        }
    }


