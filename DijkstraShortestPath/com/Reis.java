package com;

import java.util.*;
import java.util.List;
public class Reis implements Comparable {
    Stap to;
    Stap from;

    public Reis(Stap to, Stap from) {
        this.to = to;
        this.from = from;
    }

    public static Map<Integer,List<Stap>> route(Stap stap) {
        Map<Integer,List<Stap>> path = new HashMap<>();


        return path;
    }

//    public static Map<Integer,List<Stap>> route(Stap stap) {
//
//        Map<Integer,List<Stap>> path = new HashMap<>();
//        List<Stap> inner = new ArrayList<>();
//        inner.add(stap);
//        System.out.println(stap.getName());
//
//        for (int x=0;x<stap.getDirections().size();x++) {
//            Stap secondStop = stap.getDirections().get(x);
//            inner.add(secondStop);
//            System.out.println(secondStop.getName());
//
//            for (int i=0;i<secondStop.getDirections().size();i++) {
//                Stap thirdStop = secondStop.getDirections().get(i);
//                inner.add(thirdStop);
//                System.out.println(thirdStop.getName());
//
//                for (int a=0;a<thirdStop.getDirections().size();a++) {
//                    Stap fourthStop = secondStop.getDirections().get(a);
//                    System.out.println(fourthStop.getName());
//                    inner.add(fourthStop);
//                }
//
//
//            }
//            path.put(x,inner);
//
//        }
//
//        return path;
//    }


    public Stap compareTo(Stap stap1, Stap stap2) {
        return null;
    }
}
