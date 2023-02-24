package classinterface;

public class Rectangle implements Surface{

    private double with;
    private double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {

        return with*height;
    }
}
