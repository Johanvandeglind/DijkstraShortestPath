package com;

public class Treinrit extends Stap{
    Double tijd;

    public Treinrit(String name,Double afstand,Double tijd) {
        super(afstand,name);
        this.tijd = tijd;
    }

    public Double getTijd() {
        return tijd;
    }

}
