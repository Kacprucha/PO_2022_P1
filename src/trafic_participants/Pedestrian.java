package trafic_participants;

import trafic_participants.TrafficParticipants;
import zones.Zone;

public class Pedestrian implements TrafficParticipants, Footmobile {
    private String name;
    private String surname;
    private double height;
    private double weight;
    private double maxVelocity;

    Pedestrian(String n, String s, double h, double w, double mV){
        setName(n);
        setSurname(s);
        setHeight(h);
        setWeight(w);
        setMaxVelocity(mV);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
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

    public void scream(String sentence){

    }

    public void fallDown(){

    }

    public void getUp(){

    }

    @Override
    public void enterTheVehicle(Automobile vehicle){

    }
}
