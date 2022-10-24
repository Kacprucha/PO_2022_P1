package trafic_participants;

import zones.Zone;

public interface TrafficParticipants {
    public void go();

    public void stop();

    public void changeZone(Zone zone);

    public boolean ifIamOnTheRightZone(String zone);

    public void setMaxVelocity(double maxVelocity);

    public double getMaxVelocity();

    public void accelerate(double acceleration);
}
