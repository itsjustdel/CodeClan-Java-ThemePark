package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge",0, 10);
        youngVisitor = new Visitor(10, 100, 10.00);
        oldVisitor = new Visitor(30, 180, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideTrue() {
        assertEquals(true, rollerCoaster.isAllowedTo(oldVisitor));
    }

    @Test
    public void canRideFalse() {
        assertEquals(false, rollerCoaster.isAllowedTo(youngVisitor));
    }


}
