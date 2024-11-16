public abstract class Sensor {
    protected String sensorType;

    public Sensor(String sensorType) {
        this.sensorType = sensorType;
    }

    public abstract void activate();
    public abstract void deactivate();
}

