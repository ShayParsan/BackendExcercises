package _4_exceptions.exercise2;

public class Application {

    public static void main(String[] args) {
        Sensor leuven = new TemperatureSensor();
        Sensor heverlee = new TemperatureSensor();
        Sensor kesselLo = new TemperatureSensor();
    
        AverageSensor grootLeuven = new AverageSensor();
        grootLeuven.addSensor(leuven);
        grootLeuven.addSensor(heverlee);
        grootLeuven.addSensor(kesselLo);
    
        grootLeuven.setOn();
        System.out.println("temperature in regio Leuven " + grootLeuven.read() + " degrees Celsius");
        System.out.println("temperature in regio Leuven " + grootLeuven.read() + " degrees Celsius");
        System.out.println("temperature in regio Leuven " + grootLeuven.read() + " degrees Celsius");
    
        System.out.println("readings: " + grootLeuven.readings());
    }
}
