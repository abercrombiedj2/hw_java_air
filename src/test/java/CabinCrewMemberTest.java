import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Sophia", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Please fasten your seatbelts", cabinCrewMember.relayMessage());
    }

}
