import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private Flight flight;
    private Plane plane;
    private LocalDateTime departTime;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
        departTime = LocalDateTime.of(2021, Month.MAY, 24, 06, 15);
        flight = new Flight(plane, "IM777", "VCE", "EDI", departTime);
        passenger1 = new Passenger("Iain", 1);
        passenger2 = new Passenger("Gary", 2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
    }

    @Test
    public void canGetBaggageAllowance() {
        assertEquals(32.5, FlightManager.getBaggageAllowance(flight), 0.01);
    }

    @Test
    public void canGetBaggageUsed() {
        assertEquals(45.00, FlightManager.getBaggageUsed(flight), 0.01);
    }

    @Test
    public void canGetBaggageRemaining() {
        assertEquals(85.00, FlightManager.getBaggageRemaining(flight), 0.01);
    }
}
