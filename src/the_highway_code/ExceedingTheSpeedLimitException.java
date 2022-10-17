package the_highway_code;

public class ExceedingTheSpeedLimitException extends Exception {
    public ExceedingTheSpeedLimitException(String errorMessage) {
        super(errorMessage);
    }
}
