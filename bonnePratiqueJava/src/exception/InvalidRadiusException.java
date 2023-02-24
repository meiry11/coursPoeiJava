package exception;

public class InvalidRadiusException extends Exception {

    private double radius;

    public InvalidRadiusException(double radius) {
        super(""+radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
