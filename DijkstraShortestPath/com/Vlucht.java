package com;

public class Vlucht extends Stap{
    Double Kosten;

    public Vlucht(String name,Double afstand,Double kosten) {
        super(afstand,name);
        this.Kosten = kosten;
    }

    public Double getKosten() {
        return Kosten;
    }

    public void setKosten(Double kosten) {
        Kosten = kosten;
    }
}
