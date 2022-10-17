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

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getTypeOfBicycle(){
        return typeOfBicycle;
    }

    public String getColor(){
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

    public void switchFrontGear(int numberOfFrontGear){

    }

    public void switchRearGear(int numberOfRearGear){

    }

    @Override
    public void accelerate(double acceleration){ //pozwala przyspieszać lub hamować (znak + lub -)

    }

    public void ring(){

    }

    @Override
    public void scream(String sentence) {

    }

    @Override
    public void enterTheVehicle(Automobile vehicle) {

    }
}
