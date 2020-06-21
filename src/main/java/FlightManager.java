import java.util.ArrayList;

public class FlightManager {
    public static double getBaggageAllowance(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.getTotalWeight() / 2 / plane.getCapacity();
    }

    public static double getBaggageUsed(Flight flight) {
        // Assuming each bag weighs 15kg
        return flight.getPassengers()
                .stream()
                .reduce(0.0, (subtotal, passenger) -> subtotal + (passenger.getBags() * 15), Double::sum);
    }

    public static double getBaggageRemaining(Flight flight) {
        Plane plane = flight.getPlane();
        return (plane.getTotalWeight() / 2) - getBaggageUsed(flight);
    }
}
