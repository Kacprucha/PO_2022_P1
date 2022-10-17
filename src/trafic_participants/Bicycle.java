package trafic_participants;

public class Bicycle implements TrafficParticipants, Footmobile {
    private String typeOfBicycle;
    private String color;
    private double maxVelocity;

    Bicycle(String t, String c, double mV){
        setColor(c);
        setTypeOfBicycle(t);
        setMaxVelocity(mV);
    }

    public void setTypeOfBicycle(String t){
        typeOfBicycle = t;
    }

    public void setColor(String c){
        color = c;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getTypeOfBicycle(){
        return typeOfBicycle;
    }

    public String getColor(){
        return color;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void go(){

    }

    public void stop(){

    }

    public void switchFrontGear(int numberOfFrontGear){

    }

    public void switchRearGear(int numberOfRearGear){

    }

    public void accelerate(double acceleration){ //pozwala przyspieszać lub hamować (znak + lub -)

    }

    public void ring(){

    }
}
