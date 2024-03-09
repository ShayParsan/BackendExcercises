package _4_exceptions.exercise2;

public class StandardSensor implements Sensor {
    private int num;
    private boolean status = true;

    public StandardSensor(int num) {
        this.num = num;
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
        return this.num;
        
    }
    
}
