import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot captain;

    @Before
    public void before(){
        captain = new Pilot("Cpt. Phillips", Rank.CAPTAIN, "PL123");
    }

    @Test
    public void canFlyPlane(){
        assertEquals("This is your captain speaking", captain.flyPlane());
    }
}
