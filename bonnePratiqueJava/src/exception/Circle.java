package exception;

import classabstract.Surface;

public class Circle extends Surface {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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


