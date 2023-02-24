package exception;

public abstract class Surface implements Comparable<Surface>{

    double getArea(){

        return 0;
    }

    @Override
    public int compareTo(Surface o) {
        if (getArea() > o.getArea()) {

            return 1;
        } else if (getArea() < o.getArea()) {

            return -1;
        }
        return 0;


    }
}
