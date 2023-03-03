import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {


    @Nested
    class EconomyflightTest {
        private Flight economyFlght;

        @BeforeEach
        void setUp() {

            economyFlght = new Flight(1, "ECONOMY");
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {

        @Test
      public void testEconomyFlightRegularPassenger(){
          Passenger mike = new Passenger("Mike",false);

          assertEquals(1,economyFlght.getId());
          assertEquals(true,economyFlght.addPassenger(mike));
          assertEquals(1,economyFlght.getPassengers().size());
          assertEquals("Mike",economyFlght.getPassengers().get(0).getName());
      }
    }

}

