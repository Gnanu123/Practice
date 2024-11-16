public class EnergyMonitor {
    private double totalUsage;

    public EnergyMonitor() {
        this.totalUsage = 0;
    }

    public void recordUsage(double usage) {
        totalUsage += usage;
        System.out.println("Recorded usage: " + usage + " kWh");
    }

    public void displayUsage() {
        System.out.println("Total Energy Usage: " + totalUsage + " kWh");
    }
}
