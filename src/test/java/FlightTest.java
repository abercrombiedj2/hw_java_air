import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
        plane = new Plane(PlaneType.PRIVATE_JET);
        flight = new Flight(plane, "NY987", "New York", "Glasgow", "12:00");
    }

    @Test
    public void canAddPilots(){
        flight.addPilot(captain);
        ArrayList<Pilot> pilots = flight.getPilots();
        assertEquals(1, pilots.size());
    }

    @Test
    public void canAddCabinCrewMembers(){
        flight.addCabinCrewMember(chiefFlightAttendant);
        ArrayList<CabinCrewMember> cabinCrewMembers = flight.getCabinCrewMembers();
        assertEquals(1, cabinCrewMembers.size());
    }

    @Test
    public void canBookPassengers(){
        flight.bookPassenger(passenger1);
        ArrayList<Passenger> passengers = flight.getPassengers();
        assertEquals(1, passengers.size());
    }

    @Test
    public void cantBookReachedCapacity(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        ArrayList<Passenger> passengers = flight.getPassengers();
        assertEquals(3, passengers.size());
    }

    @Test
    public void canGetEmptySeats(){
        flight.bookPassenger(passenger1);
        assertEquals(2, flight.getEmptySeats());
    }
}
