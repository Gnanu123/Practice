public class SmokeDetector extends Sensor {
    public SmokeDetector() {
        super("Smoke Detector");
    }

    public void detectSmoke() {
        boolean smokeDetected = Math.random() < 0.05; // Random smoke detection
        if (smokeDetected) {
            System.out.println("Smoke detected! Triggering fire alarm.");
        } else {
            System.out.println("No smoke detected.");
        }
    }

    @Override
    public void activate() {
        System.out.println("Smoke Detector activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Smoke Detector deactivated.");
    }
}
