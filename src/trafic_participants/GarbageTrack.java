package trafic_participants;

import zones.Zone;

import java.util.ArrayList;
import java.util.List;

public class GarbageTrack extends Car{
    private String typeOfGarbage;
    private int amountOfCargo;
    private List<String> addresses = new ArrayList<String>();
    private final int LIMIT = 1000;

    GarbageTrack(String b, String t, String c, int p, int a, double mV, Zone currentRoad, String driver, String type, int amount, List<String> addresses) {
        super(b, t, c, p, a, mV, currentRoad, driver);
        setTypeOfGarbage(type);
        setAmountOfCargo(amount);
        setAddresses(addresses);
    }

    public String getTypeOfGarbage() {
        return typeOfGarbage;
    }

    public void setTypeOfGarbage(String typeOfGarbage) {
        this.typeOfGarbage = typeOfGarbage;
    }

    public int getAmountOfCargo() {
        return amountOfCargo;
    }

    public void setAmountOfCargo(int amountOfCargo) {
        this.amountOfCargo = amountOfCargo;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    private boolean ifOverloaded() {
        return false;
    }
}
