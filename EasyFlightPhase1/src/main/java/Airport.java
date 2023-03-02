import java.util.ArrayList;
import java.util.List;

public class Airport {

    public static void main(String[] args) {

        Passenger jack = new Passenger("jack",true);
        Passenger kady = new Passenger("kady",true);
        Passenger jeanne = new Passenger("jeanne",false);

        Flight flight1 = new Flight(1,"ECONOMY");
        Flight flight2 = new Flight(2,"AFFAIRES");

        flight1.addPassenger(jack);
        flight1.addPassenger(kady);
        flight2.addPassenger(jeanne);

        List<Passenger>passengers = new ArrayList<>();

        for (Passenger p:passengers
             ) {
            System.out.println();

        }
    }
}
