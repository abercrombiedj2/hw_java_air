import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private Pilot captain;
    private Pilot firstOfficer;
    private CabinCrewMember chiefFlightAttendant;
    private CabinCrewMember flightAttendant;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private FlightManager flightManager;

    @Before
    public void before(){
        passenger1 = new Passenger("David", 1);
        passenger2 =  new Passenger("Ryan", 3);
        passenger3 = new Passenger("Taylor", 2);
        passenger4 = new Passenger("Paola", 0);
        chiefFlightAttendant = new CabinCrewMember("Ash", Rank.CHIEF_FLIGHT_ATTENDANT);
        flightAttendant = new CabinCrewMember("Jen", Rank.FLIGHT_ATTENDANT);
        firstOfficer = new Pilot("Craig", Rank.FIRST_OFFICER, "PL456");
        captain = new Pilot("Steve", Rank.CAPTAIN, "PL123");
        plane = new Plane(PlaneType.BOEING_737);
        flight = new Flight(plane, "NY987", "New York", "Glasgow", "12:00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateReservedBaggagePerPassenger(){
        assertEquals(20, flightManager.calculateReservedBaggagePerPassenger(), 0);
    }

    @Test
    public void canCalculateTotalBookedBaggage(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(80, flightManager.calculateTotalBookedBaggage(), 0);
    }

    @Test
    public void canCalculateRemainderBaggageWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(3920, flightManager.calculateRemainderBaggageWeight(), 0);
    }
}
