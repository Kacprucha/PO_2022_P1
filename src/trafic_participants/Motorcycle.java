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

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public int getProductionDate() {
        return productionDate;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getMaxVelocity() {
        return maxVelocity;
    }

    @Override
    public void go(){

    }

    @Override
    public void stop(){

    }

    @Override
    public void turn(char c) {

    }

    @Override
    public boolean ifIamOnTheRightZone(String zone) {
        return false;
    }

    @Override
    public void switchGear(int numberOfGear){

    }

    @Override
    public void accelerate(double acceleration){

    }

    @Override
    public void beep(){

    }
}
