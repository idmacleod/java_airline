import org.junit.Before;
import org.junit.Test;

public class FlightManager {
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
        flight = new Flight(plane, "IM777", "VCE", "EDI", "06:15");
        passenger1 = new Passenger("Iain", 1);
        passenger2 = new Passenger("Gary", 2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
    }

    @Test
    public void canCalculateBagWeightPerPassenger() {

    }
}
