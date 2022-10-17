package trafic_participants;

import trafic_participants.Automobile;
import trafic_participants.TrafficParticipants;

public class Motorcycle implements TrafficParticipants, Automobile {
    private String brand;
    private String typeOfMotorcycle;
    private String color;
    private int productionDate;
    private double maxVelocity;

    Motorcycle(String b, String t, String c, int p, double mV){
        setBrand(b);
        setTypeOfMotorcycle(t);
        setColor(c);
        setProductionDate(p);
        setMaxVelocity(mV);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public String getColor() {
        return color;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void go(){

    }

    public void stop(){

    }

    public void switchGear(int numberOfGear){

    }

    public void accelerate(double acceleration){

    }

    public void beep(){

    }
}
