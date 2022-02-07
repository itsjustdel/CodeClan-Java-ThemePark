package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor youngVisitor;
    Visitor oldVisitor;
    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone",0, 7);
        youngVisitor = new Visitor(10, 100, 10.00);
        oldVisitor = new Visitor(30, 180, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canPlayTrue() {
        assertEquals(true, playground.isAllowedTo(youngVisitor));
    }
    @Test
    public void canPlayFalse() {
        assertEquals(false, playground.isAllowedTo(oldVisitor));
    }

}
