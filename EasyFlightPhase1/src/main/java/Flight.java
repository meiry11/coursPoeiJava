import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int id;
    List<Passenger>passengers = new ArrayList<>();

    String typevol;

    public Flight(int id, String typevol) {
        this.id = id;
        this.typevol = typevol;
    }

    public Flight() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getTypevol() {
        return typevol;
    }

    public void setTypevol(String typevol) {
        this.typevol = typevol;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", passengers=" + passengers +
                ", typevol='" + typevol + '\'' +
                '}';
    }

    public boolean addPassenger(Passenger passenger)  {
        switch (getTypevol()){
            case "ECONOMY":
                return passengers.add(passenger);
            case "AFFAIRES":
                if(passenger.isVip()){
                     return passengers.add(passenger);
                }else{
                    return false;
                }
            default:
            throw new RuntimeException("erreur de type"+getTypevol());

        }
    }

    public boolean removePassenger(Passenger passenger){
       switch (typevol){
           case "Economy":
               if (!passenger.isVip()) {

                   return passengers.remove(passenger);
               }
               return false;
           case "AFFAIRES" :
               return false;
           default:
               throw new RuntimeException("Unknown type:" + typevol);
       }
    }
}
