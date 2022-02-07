package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Park extends Attraction implements ITicketed {

    public Park(String name, int visitCount, int rating) {
        super(name, visitCount, rating);
    }

    @Override
    public double defaultPrice() {
        return 25.00;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 10.00;
    }

}
