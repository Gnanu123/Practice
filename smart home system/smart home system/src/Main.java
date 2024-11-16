public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(72);
        WaterLeakSensor waterLeakSensor = new WaterLeakSensor();
        SmokeDetector smokeDetector = new SmokeDetector();
        SecuritySystem securitySystem = new SecuritySystem();
        EnergyMonitor energyMonitor = new EnergyMonitor();

        // Simulate temperature control
        thermostat.adjustTemperature(75);
        thermostat.displayTemperature();

        // Simulate water leak detection
        waterLeakSensor.checkForLeak();

        // Simulate fire detection
        smokeDetector.detectSmoke();

        // Simulate security system
        securitySystem.detectMotion();
        securitySystem.triggerAlarm();

        // Simulate energy monitoring
        energyMonitor.recordUsage(150);
        energyMonitor.displayUsage();

        System.out.println("Smart Home System is running.");
    }
}

