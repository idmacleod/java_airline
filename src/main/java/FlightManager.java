public class FlightManager {
    public static double baggageAllowance(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.getTotalWeight() / 2 / plane.getCapacity();
    }
}
