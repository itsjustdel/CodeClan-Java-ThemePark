import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> themeParkAssets;

    public ThemePark(String name, ArrayList<IReviewed> themeParkAssets) {
        this.name = name;
        this.themeParkAssets = themeParkAssets;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return themeParkAssets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IReviewed> getAssets(){
        return this.themeParkAssets;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addVisitedAttraction(attraction);
        attraction.addToVisitCount();
    }
}
