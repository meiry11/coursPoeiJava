package exception;

public class CircleCustomEx {
    private double radius;

    public CircleCustomEx(double radius) throws InvalidRadiusException {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException{
        if(radius<0)
            throw  new IllegalArgumentException("");

        this.radius = radius;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }



}
