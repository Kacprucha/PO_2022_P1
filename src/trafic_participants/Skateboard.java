package trafic_participants;

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

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
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
}
