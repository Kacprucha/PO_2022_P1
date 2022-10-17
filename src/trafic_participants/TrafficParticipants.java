package trafic_participants;

public interface TrafficParticipants {
    public void go();

    public void stop();

    public void turn(char c);

    public boolean ifIamOnTheRightZone(String zone);

    public void setMaxVelocity(double maxVelocity);

    public double getMaxVelocity();

    public void accelerate(double acceleration);
}
