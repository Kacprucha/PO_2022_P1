package zones;

public class Zone {
    private int length;
    private int wight;
    private String type;
    private boolean passable;

    public Zone(int l, int w, String t, boolean p) {
        setLength(l);
        setWight(w);
        setType(t);
        setPassable(p);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }
}
