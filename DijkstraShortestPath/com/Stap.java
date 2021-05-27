package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Stap {
    List<Stap> directions = new ArrayList<>();
    Double Afstand;
    String Name;

    public Stap(Double afstand,String Name) {
        Afstand = afstand;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void putDirections(Stap stap) {
        directions.add(stap);
    }
    public Double getAfstand() {
        return Afstand;
    }

    public List<Stap> getDirections() {
        return directions;
    }
}
