package trafic_participants;

import zones.Zone;

public class Truck extends Car {
    private double capacity;
    private double enginePower;
    private double length;
    private double weight;
    private double height;
    Truck(String b, String t, String c, int p, int a, double mV, Zone currentRoad, String driver,
          double capacity, double enginePower, double length, double weight, double height) {
        super(b, t, c, p, a, mV, currentRoad, driver);
        setCapacity(capacity);
        setEnginePower(enginePower);
        setLength(length);
        setWeight(weight);
        setHeight(height);
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
