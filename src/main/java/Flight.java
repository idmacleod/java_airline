import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departAirport;
    private LocalDateTime departTime;
    private List<Integer> availableSeats;

    public Flight(Plane plane, String number, String destination,
                  String departAirport, LocalDateTime departTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
        this.availableSeats = IntStream.rangeClosed(1, plane.getCapacity()).boxed().collect(Collectors.toList());
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

    public void bookPassenger(Passenger passenger) {
        // Assuming bags weigh 15kg
        double baggage = passenger.getBags() * 15.0;
        if (countAvailableSeats() > 0 && baggage <= FlightManager.getBaggageAllowance(this)) {
            passengers.add(passenger);
            passenger.setFlight(this);
            assignRandomSeat(passenger);
        }
    }

    public int countAvailableSeats() {
        return availableSeats.size();
    }

    public boolean seatIsAvailable(int seat) {
        return availableSeats.contains(seat);
    }

    public void assignRandomSeat(Passenger passenger) {
        Collections.shuffle(availableSeats);
        int seat = availableSeats.remove(0);
        passenger.setSeat(seat);
    }
}