package com;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Rit r1 = new Rit("rit 1",100.00,130.00);
        Rit r2 = new Rit("rit 2",200.00,130.00);
        Treinrit t1 = new Treinrit("Trein 1",80.00,60.00);
        Vlucht v1 = new Vlucht("Vlucht 1",1000.00,120.00);

        r1.putDirections(r2);
        r1.putDirections(t1);
        r2.putDirections(v1);
        t1.putDirections(v1);

        Reis trip = new Reis(v1,r1);

        System.out.print(trip.route(r1).toString());

    }
}
