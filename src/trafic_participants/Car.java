package trafic_participants;

import zones.Zone;

public class Car implements TrafficParticipants, Automobile {
    private String brand;
    private String typeOfCar;
    private String color;
    private String driver;
    private int productionDate;
    private int amountOfSeats;
    private double maxVelocity;
    private Zone currentRoad;
    private int startPositionX;
    private int startPositionY;
    private int endPositionX;
    private int endPositionY;

    Car(String b, String t,  String c, int p, int a, double mV, Zone currentRoad, String driver, int sx, int sy, int ex, int ey){
        setBrand(b);
        setTypeOfCar(t);
        setColor(c);
        setProductionDate(p);
        setAmountOfSeats(a);
        setMaxVelocity(mV);
        setCurrentRoad(currentRoad);
        setDriver(driver);
        setStartPositionX(sx);
        setStartPositionY(sy);
        setEndPositionX(sx);
        setEndPositionY(sy);
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


    public void setDriver(String driver){
        this.driver = driver;
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

    public void setCurrentRoad(Zone currentRoad) {
        this.currentRoad = currentRoad;
    }

    public Zone getCurrentRoad() {
        return currentRoad;
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

    public String getDriver() {
        return driver;
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
    public void changeZone(Zone zone) {
        if(currentRoad.vehicleCanMoveToTheOtherZone(zone.getId(), "Aoutomobile", getStartPositionX())) {
            currentRoad = zone;
        }
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

    class Lights{
        private String color;
        private int brightness;
        private double radius;

        Lights(String color, int brightness, double radius){
            setColor(color);
            setBrightness(brightness);
            setRadius(radius);
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setBrightness(int brightness) {
            this.brightness = brightness;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return color;
        }
        public int getBrightness() {
            return brightness;
        }

        public double getRadius() {
            return radius;
        }
    }
    class Radio{
        private String brand;
        private double signal;
        private boolean smartRadio;

        Radio(String brand, double signal){
            setBrand(brand);
            setSignal(signal);
            smartRadio = false;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setSignal(double signal) {
            this.signal = signal;
        }

        public void setSmartRadio() {
            smartRadio = true;
        }

        public String getBrand() {
            return brand;
        }

        public double getSignal() {
            return signal;
        }
    }
}
