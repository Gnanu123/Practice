public class Thermostat extends Sensor {
    private int currentTemperature;
    private int desiredTemperature;

    public Thermostat(int desiredTemperature) {
        super("Thermostat");
        this.desiredTemperature = desiredTemperature;
        this.currentTemperature = 70; // Default temperature
    }

    public void adjustTemperature(int newTemperature) {
        this.desiredTemperature = newTemperature;
        if (currentTemperature < desiredTemperature) {
            System.out.println("Heating to " + desiredTemperature + "°F.");
        } else {
            System.out.println("Cooling to " + desiredTemperature + "°F.");
        }
        currentTemperature = desiredTemperature;
    }

    public void displayTemperature() {
        System.out.println("Current Temperature: " + currentTemperature + "°F");
    }

    @Override
    public void activate() {
        System.out.println("Thermostat activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Thermostat deactivated.");
    }
}

