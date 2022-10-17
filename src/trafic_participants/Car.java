package trafic_participants;

import trafic_participants.Automobile;
import trafic_participants.TrafficParticipants;

public class Car implements TrafficParticipants, Automobile {
    private String brand;
    private String typeOfCar;
    private String color;
    private int productionDate;
    private int amountOfSeats;
    private double maxVelocity;

    Car(String b, String t,  String c, int p, int a, double mV){
        setBrand(b);
        setTypeOfCar(t);
        setColor(c);
        setProductionDate(p);
        setAmountOfSeats(a);
        setMaxVelocity(mV);
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
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
