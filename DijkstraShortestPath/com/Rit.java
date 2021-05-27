package com;

public class Rit extends Stap{
    Double Snelheid;


    public Rit(String name,Double afstand,Double snelheid) {
        super(afstand,name);
        this.Snelheid = snelheid;
    }
    public Double getSnelheid() {
        return Snelheid;
    }
}
