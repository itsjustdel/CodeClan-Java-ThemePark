package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        youngVisitor = new Visitor(10, 100, 10.00);
        oldVisitor = new Visitor(30, 180, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, tobaccoStall.getRating());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyFagsTrue() {
        assertEquals(true, tobaccoStall.isAllowedTo(oldVisitor));
    }

    @Test
    public void canBuyFagsFalse() {
        assertEquals(false, tobaccoStall.isAllowedTo(youngVisitor));
    }
}
