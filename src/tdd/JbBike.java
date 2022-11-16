package tdd;

public class JbBike {
    private boolean power;
    private int gear;
    private int accelerate;
    private int decelerate;
    public void setpowerOn(boolean value) {
        power = value;
    }

    public boolean getpower() {
        return power;
    }

    public void setGear(int speed) {
        if (speed <= 20){
            gear = 1;
    }
        if (speed >= 21) {
            gear = 2;
        }
        if (speed >= 31) {
            gear = 3;

        }
        if (speed >= 41){
            gear = 4;
        }
}

    public int getgear() {
        return gear;
    }

    public void setacceleration(int speed) {
        if (speed <= 20) {
            accelerate = speed + 1;
        }
        if (speed >= 21 ) {
            accelerate = speed + 2;
        }
        if (speed >= 31) {
            accelerate = speed + 3;
        }
        if (speed >= 41) {
            accelerate = speed + 4;
        }
    }

    public int getacceleration() {
        return accelerate;
    }

    public void setdeceleration(int speed) {
        if (speed <= 20) {
            decelerate = speed - 1;
        }
        if (speed >= 21 ) {
            decelerate = speed - 2;
        }
        if (speed >= 31) {
            decelerate = speed - 3;
        }
        if (speed >= 41) {
            decelerate = speed - 4;
        }
    }

    public int getdeceleration() {
        return decelerate;
    }

    public void setpowerOff(boolean value) {
        power = value;
    }
}
