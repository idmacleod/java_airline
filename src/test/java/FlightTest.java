import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
        flight = new Flight(plane, "IM777", "VCE", "EDI", "06:15");
        passenger1 = new Passenger("Iain", 1);
        passenger2 = new Passenger("Gary", 0);
        passenger3 = new Passenger("Evlyn", 2);
        passenger4 = new Passenger("Donald", 4);
        passenger5 = new Passenger("Paddington", 5);
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

    @Test
    public void canGetAvailableSeats() {
        assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void canCheckIfSeatsAvailable__true() {
        flight.bookPassenger(passenger1);
        assertTrue(flight.seatsAvailable());
    }

    @Test
    public void canCheckIfSeatsAvailable__false() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertFalse(flight.seatsAvailable());
    }

    @Test
    public void cannotBookPassengerIfNoSeats() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(4, flight.countPassengers());
    }
}