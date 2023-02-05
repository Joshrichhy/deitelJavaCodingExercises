package Pauline;

public class DamianPuff {

        private int number ;
        private int numberTwo ;
        private int sum;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = getNumber() + getNumberTwo();
    }
}
