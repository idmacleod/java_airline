import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
        flight = new Flight(plane, "IM777", "VCE", "EDI", "06:15");
    }

    @Test
    public void flightStartsEmpty() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasNumber() {
        assertEquals("IM777", flight.getNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("VCE", flight.getDestination());
    }

    @Test
    public void hasDepartAirport() {
        assertEquals("EDI", flight.getDepartAirport());
    }

    @Test
    public void hasDepartTime() {
        assertEquals("06:15", flight.getDepartTime());
    }
}