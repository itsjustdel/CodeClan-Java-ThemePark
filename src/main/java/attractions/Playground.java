package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int visitCount, int rating) {
        super(name, visitCount, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() < 16);
    }
}
