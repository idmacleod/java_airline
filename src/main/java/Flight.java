import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departAirport;
    private LocalDateTime departTime;

    public Flight(Plane plane, String number, String destination,
                  String departAirport, LocalDateTime departTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public LocalDateTime getDepartTime() {
        return departTime;
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        // Assuming bags weigh 15kg
        double baggage = passenger.getBags() * 15.0;
        if (getAvailableSeats() > 0 && baggage <= FlightManager.getBaggageAllowance(this)) {
            passengers.add(passenger);
            passenger.setFlight(this);
        }
    }
}