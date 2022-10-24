package trafic_participants;

import zones.Zone;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Car{
    private List<String> stops = new ArrayList<String>();
    private int busNumber;
    private int passengers;
    private int delay;

    Bus(String b, String t, String c, int p, int a, double mV, Zone currentRoad, String driver, int sx, int sy, int ex, int ey, List<String> stops, int busNumber) {
        super(b, t, c, p, a, mV, currentRoad, driver, sx, sy, ex, ey);
        setStops(stops);
        setBusNumber(busNumber);
    }

    public void setStops(List<String> stops) {
        this.stops = stops;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setPassengers(int passengers) {
        this.passengers = 0;
    }
    public void addPassengers(int x){
        passengers += x;
    }

    public void increaseDelay(int x){
        delay += x;
    }

    public List<String> getStops() {
        return stops;
    }
    public int getBusNumber() {
        return busNumber;
    }
    public int getPassengers() {
        return passengers;
    }

    public int getDelay() {
        return delay;
    }
}
