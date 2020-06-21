public class FlightManager {
    public static double getBaggageAllowance(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.getTotalWeight() / 2 / plane.getCapacity();
    }

//    public static double getBaggageUsed(Flight flight) {
//
//    }
}
