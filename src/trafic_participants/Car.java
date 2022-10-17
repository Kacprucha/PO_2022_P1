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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public String getColor() {
        return color;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
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
