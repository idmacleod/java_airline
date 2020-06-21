import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private Flight flight;
    private Plane plane;
    private LocalDateTime departTime;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
        departTime = LocalDateTime.of(2021, Month.MAY, 24, 06, 15);
        flight = new Flight(plane, "IM777", "VCE", "EDI", departTime);
        passenger1 = new Passenger("Iain", 1);
        passenger2 = new Passenger("Gary", 2);
        passenger3 = new Passenger("Evlyn", 2);
        passenger4 = new Passenger("Donald", 2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
    }

    @Test
    public void canGetBaggageAllowance() {
        assertEquals(32.5, FlightManager.getBaggageAllowance(flight), 0.01);
    }

    @Test
    public void canGetBaggageUsed() {
        assertEquals(105.00, FlightManager.getBaggageUsed(flight), 0.01);
    }

    @Test
    public void canGetBaggageRemaining() {
        assertEquals(25.00, FlightManager.getBaggageRemaining(flight), 0.01);
    }

    @Test
    public void canSortPassengersBySeatNumber() {
        FlightManager.sortPassengersBySeatNumber(flight);
        assertEquals("1 2 3 4 ", flight.printSeatNumbers());
    }
}
