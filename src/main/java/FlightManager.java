public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getBaggageAllowance() {
        Plane plane = flight.getPlane();
        return plane.getTotalWeight() / 2 / plane.getCapacity();
    }
}
