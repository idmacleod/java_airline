import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void canGetBaggageWeight() {
        // Assume all bags weigh 15kg
        assertEquals(30.00, passenger.getBaggageWeight(), .01);
    }
}
