package trafic_participants;

import trafic_participants.Automobile;
import trafic_participants.Footmobile;
import trafic_participants.TrafficParticipants;

public class Scooter implements TrafficParticipants, Footmobile, Automobile {
    private String brand;
    private String color;
    private double maxVelocity;

    Scooter(String b, String c, double mV){
        setBrand(b);
        setColor(c);
        setMaxVelocity(mV);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
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

    public void accelerate(double acceleration){

    }

    public void ring(){

    }
}
