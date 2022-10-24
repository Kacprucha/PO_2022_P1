package zones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zone {
    private int length;
    private int wight;
    private String id;
    private boolean passable;
    private int startPositionX;
    private int startPositionY;
    private int endPositionX;
    private int endPositionY;
    private List<CrossAblePath> listOfVirtualZones;

    public Zone(int l, int w, String t, boolean p, int sx, int sy, int ex, int ey) {
        setLength(l);
        setWight(w);
        setId(t);
        setPassable(p);
        setStartPositionX(sx);
        setStartPositionY(sy);
        setEndPositionX(ex);
        setEndPositionY(ey);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public String getId() {
        return id;
    }

    public void setId(String type) {
        this.id = type;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public int getStartPositionX() {
        return startPositionX;
    }

    public void setStartPositionX(int startPositionX) {
        this.startPositionX = startPositionX;
    }

    public int getStartPositionY() {
        return startPositionY;
    }

    public void setStartPositionY(int startPositionY) {
        this.startPositionY = startPositionY;
    }

    public int getEndPositionX() {
        return endPositionX;
    }

    public void setEndPositionX(int endPositionX) {
        this.endPositionX = endPositionX;
    }

    public int getEndPositionY() {
        return endPositionY;
    }

    public void setEndPositionY(int endPositionY) {
        this.endPositionY = endPositionY;
    }

    public void addToListOfVirtualZones(int sx, int ex, String zone, String type) {
        if(type == null) {
            listOfVirtualZones.add(new CrossAblePath(sx, ex, zone));
        } else {
            listOfVirtualZones.add(new CrossAblePath(sx, ex, zone, type));
        }
    }

    public boolean vehicleCanMoveToTheOtherZone(String id, String type, int x) {
        for (CrossAblePath listOfVirtualZone : listOfVirtualZones) {
            if (Objects.equals(listOfVirtualZone.getIdOfTheNextZone(), id)
                    && listOfVirtualZone.getStaringX() < x
                    && x < listOfVirtualZone.getEndingX()) {
                for(String tapesThatCanCross : listOfVirtualZone.getTypesOfVehicle()) {
                    if(tapesThatCanCross.equals(type)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public int calculatorOfMove(int x) {
        return ((endPositionY - startPositionY) / (endPositionX - startPositionX)) * x + startPositionY - ((endPositionY - startPositionY) / (endPositionX - startPositionX)) * startPositionX;
    }

    private class CrossAblePath {
        private int staringX;
        private int endingX;
        private List<String> typesOfVehicle = new ArrayList<>();
        private String idOfTheNextZone;

        CrossAblePath(int sx, int ex, String zone, String type) {
            staringX = sx;
            endingX = ex;
            idOfTheNextZone = zone;
            typesOfVehicle.add(type);
        }

        CrossAblePath(int sx, int ex, String zone) {
            staringX = sx;
            endingX = ex;
            idOfTheNextZone = zone;
        }

        public int getStaringX() {
            return staringX;
        }

        public void setStaringX(int sx) {
            staringX = sx;
        }

        public int getEndingX() {
            return endingX;
        }

        public void setEndingX(int endingX) {
            this.endingX = endingX;
        }

        public boolean ifTypeCanCross(String type) {
            if(!typesOfVehicle.isEmpty()) {
                return typesOfVehicle.contains(type);
            } else {
                return true;
            }
        }

        public void addTypeThatCanCross(String type) {
            typesOfVehicle.add(type);
        }

        public void removeTypeThatCanCross(String type) {
            typesOfVehicle.remove(type);
        }

        public void makeItCrossAbleForEveryone() {
            typesOfVehicle.clear();
        }

        public List<String> getTypesOfVehicle() {
            return typesOfVehicle;
        }

        public String getIdOfTheNextZone() {
            return idOfTheNextZone;
        }

        public void setIdOfTheNextZone(String idOfTheNextZone) {
            this.idOfTheNextZone = idOfTheNextZone;
        }
    }
}
