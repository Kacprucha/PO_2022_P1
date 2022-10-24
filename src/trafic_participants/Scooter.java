package trafic_participants;

import zones.Zone;

public class Scooter implements TrafficParticipants, Automobile {
    private String brand;
    private String color;
    private String actualZone;
    private double maxVelocity;

    Scooter(String b, String c, double mV, String zone){
        setBrand(b);
        setColor(c);
        setMaxVelocity(mV);
        setActualZone(zone);
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String getBrand() {
        return brand;
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
    public void changeZone(Zone zone) {

    }

    @Override
    public boolean ifIamOnTheRightZone(String zone) {
        return false;
    }

    @Override
    public void switchGear(int numberOfGear) {

    }

    @Override
    public void accelerate(double acceleration){

    }

    @Override
    public void beep() {

    }

    public String getActualZone() {
        return actualZone;
    }

    public void setActualZone(String actualZone) {
        this.actualZone = actualZone;
    }
}
