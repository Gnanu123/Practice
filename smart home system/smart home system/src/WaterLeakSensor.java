public class WaterLeakSensor extends Sensor {
    public WaterLeakSensor() {
        super("Water Leak Sensor");
    }

    public void checkForLeak() {
        boolean leakDetected = Math.random() < 0.1; // Random leak detection
        if (leakDetected) {
            System.out.println("Water leak detected! Alerting user.");
        } else {
            System.out.println("No water leaks detected.");
        }
    }

    @Override
    public void activate() {
        System.out.println("Water Leak Sensor activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Water Leak Sensor deactivated.");
    }
}

