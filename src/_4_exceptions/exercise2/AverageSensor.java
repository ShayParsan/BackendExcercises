package _4_exceptions.exercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    private boolean status;
    private HashSet<Sensor> sensors = new HashSet<>();
    private List<Integer> measurementResults = new ArrayList<>();

    public AverageSensor() {
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()== true) {
                return false;
            }
        }
        return status;
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
        if (this.status) {
            Random num = new Random();
            int number = num.nextInt(61) - 30; // Generates a random number between -30 and 30
            measurementResults.add(number); // Add the measurement result to the list
            return number;
        } else {
            throw new IllegalStateException("Sensor is not in correct state (off)");
        }
    }

    public List<Integer> readings() {
        return new ArrayList<>(measurementResults); // Return a copy of the measurementResults list
    }
}



