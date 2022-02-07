import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private ArrayList<IReviewed> themeParkAssets;
    @Before
    public void before() {
        themeParkAssets = new ArrayList<IReviewed>();
        themeParkAssets.add(new Dodgems("Dodger Bodger",0,4));
        themeParkAssets.add((new CandyflossStall("Candy Bandy Sudden Surprise","Mr Sugar", ParkingSpot.A4,6)));
        themePark = new ThemePark("Thunder Face", themeParkAssets);
    }

    @Test
    public void hasName() {
        assertEquals("Thunder Face", themePark.getName());
    }

    @Test
    public void hasAssets() {
    assertEquals(2, themePark.getAssets().size());
    }

    @Test
    public void vistitorVisitsAttraction() {

        Visitor visitor = new Visitor(19,190,34);
        Attraction attraction = (Attraction) themeParkAssets.get(0);
        themePark.visit(visitor, attraction);

        //visits to attraction
        assertEquals(1, attraction.getVisitCount());
        //attraction in visitor
        assertEquals(attraction, visitor.getVisitedAttractions().get(0));
    }
}
