public class SecuritySystem extends Sensor {
    public SecuritySystem() {
        super("Security System");
    }

    public void detectMotion() {
        boolean motionDetected = Math.random() < 0.2; // Random motion detection
        if (motionDetected) {
            System.out.println("Motion detected! Triggering security alarm.");
        } else {
            System.out.println("No motion detected.");
        }
    }

    public void triggerAlarm() {
        System.out.println("Security alarm is sounding!");
    }

    @Override
    public void activate() {
        System.out.println("Security System activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Security System deactivated.");
    }
}

