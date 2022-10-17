package trafic_participants;

public class Tram implements TrafficParticipants, Automobile {
    private String brand;
    private String color;
    private double length;
    private int amountOfSeats;
    private int productionDate;
    private double maxVelocity;

    Tram(String b, String c, double l, int a, int p, double mV) {
        setBrand(b);
        setColor(c);
        setLength(l);
        setAmountOfSeats(a);
        setProductionDate(p);
        setMaxVelocity(mV);
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
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

    @Override
    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public int getProductionDate() {
        return productionDate;
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
