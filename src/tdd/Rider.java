package tdd;

public class Rider {
    public double sales(double numberOfparcel) {
        double collectionRate =  (numberOfparcel / 100) * 100;
        double bonus = 0;

        if ( collectionRate >= 50 && collectionRate <= 59) {

            bonus = collectionRate * 200;

        } else {
            if (collectionRate >= 60 && collectionRate <= 69) {
               bonus = collectionRate * 250;

            } else {
                if (collectionRate >= 70) {
                  bonus = numberOfparcel * 500;

                }

            }
        }

                return bonus;
    }}



