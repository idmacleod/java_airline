import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Iain", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Iain", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void flightStartsNull() {
        assertNull(passenger.getFlight());
    }

    @Test
    public void canSetFlight() {
        Plane plane = new Plane(PlaneType.CESSNA172);
        LocalDateTime departTime = LocalDateTime.of(2021, Month.MAY, 24, 06, 15);
        Flight flight = new Flight(plane, "IM777", "VCE", "EDI", departTime);
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void seatStartsNull() {
        assertNull(passenger.getSeat());
    }

    @Test
    public void canSetSeat() {
        passenger.setSeat(1);
        assertEquals(1, passenger.getSeat());
    }
}
