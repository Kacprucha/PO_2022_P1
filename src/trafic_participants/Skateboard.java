package trafic_participants;

import zones.Zone;

public class Skateboard implements TrafficParticipants, Footmobile {
    private String brand;
    private double maxVelocity;

    Skateboard(String b, double mV){
        setBrand(b);
        setMaxVelocity(mV);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
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
    public void accelerate(double acceleration){

    }

    @Override
    public void scream(String sentence) {

    }

    @Override
    public void enterTheVehicle(Automobile vehicle) {

    }
}
