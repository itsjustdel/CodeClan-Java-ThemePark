package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int visitCount, int rating) {
        super(name, visitCount, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12)
            return defaultPrice() / 2;
        else
            return defaultPrice();

    }
}
