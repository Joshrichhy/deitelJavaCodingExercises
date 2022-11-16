package tdd;

public class AirConditioner {
    private boolean state;
    private int temperature;



    public boolean getstate() {
        return state;

    }


    public void setOn(boolean On) {
        state = true;
    }

    public void setOff(boolean Off) {
        state = true;
    }

    public void increaseTemperature() {
           if (temperature < 30)
               temperature = temperature + 1;

        }
    public void decreaseTemperature() {
        if (temperature > 16)
            temperature = temperature - 1;
    }

    public int getTemperature() {
        return temperature;

    }
    public void setTemperature(int degree){
        temperature = degree;
    }


}
