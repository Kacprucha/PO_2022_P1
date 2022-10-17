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

    public void setBrand(String brand) {
        this.brand = brand;
    }

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

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
    }

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
