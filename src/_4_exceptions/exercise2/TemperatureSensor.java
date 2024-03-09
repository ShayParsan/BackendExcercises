package _4_exceptions.exercise2;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean status;
    public TemperatureSensor() {

    }

    @Override
    public boolean isOn() {
        if (this.status == true){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
        
    }

    @Override
    public int read() {
        if (this.status == true) {
            Random num = new Random();
            int number = num.nextInt(-30,30);
            return number;
        } else {
            throw new IllegalStateException("not correct state");
        }
    }
    
}
