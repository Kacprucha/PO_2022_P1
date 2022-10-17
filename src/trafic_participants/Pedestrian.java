package trafic_participants;

import trafic_participants.TrafficParticipants;

public class Pedestrian implements TrafficParticipants {
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

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void go(){

    }

    public void stop(){

    }
    public void accelerate(double acceleration){

    }

    public void scream(String sentence){

    }

    public void fallDown(){

    }

    public void getUp(){

    }

    public void enterBus(){

    }

    public void enterTram(){

    }
}
