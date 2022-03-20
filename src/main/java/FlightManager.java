public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double calculateReservedBaggagePerPassenger(){
        int totalWeight = this.flight.getPlane().getPlaneType().getWeight();
        int capacity = this.flight.getPlane().getPlaneType().getCapacity();
        double cargoWeight = totalWeight * 0.25;
        int passengerWeight = capacity * 80;
        double reservedBaggagePerPassenger = (cargoWeight - passengerWeight) / capacity ;
        return reservedBaggagePerPassenger;
    }

    public double calculateTotalBookedBaggage(){
        double reservedBaggagePerPassenger = this.calculateReservedBaggagePerPassenger();
        int noOfPassengers = this.flight.getPassengers().size();
        return reservedBaggagePerPassenger * noOfPassengers;
    }

    public double calculateRemainderBaggageWeight(){
        double reservedBaggagePerPassenger = this.calculateReservedBaggagePerPassenger();
        int capacity = this.flight.getPlane().getPlaneType().getCapacity();
        double totalBaggageWeight = reservedBaggagePerPassenger * capacity;
        double totalBookedBaggage = this.calculateTotalBookedBaggage();
        return totalBaggageWeight - totalBookedBaggage;
    }

}
