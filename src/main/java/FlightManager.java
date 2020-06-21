import java.util.ArrayList;

public class FlightManager {
    public static double getBaggageAllowance(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.getTotalWeight() / 2 / plane.getCapacity();
    }

    public static double getBaggageUsed(Flight flight) {
        ArrayList<Passenger> passengers = flight.getPassengers();
        double total = 0.00;
        for (Passenger passenger : passengers) {
            // Assuming each bag weighs 15kg
            total += (passenger.getBags() * 15.00);
        }
        return total;
    }
}
