package com;

import java.util.*;
import java.util.List;
public class Reis implements Comparable {
    Stap to;
    Stap from;
    Map<Integer,List<Stap>> path = new HashMap<>();
    List<String> inner = new ArrayList<>();
    public Reis(Stap to, Stap from) {
        this.to = to;
        this.from = from;
    }

    public List<String> route(Stap stap) {
        inner.add(stap.getName());
        Stap best = getBestDir(stap);
        return inner;
    }

    public Stap getBestDir(Stap stap){
        if (stap.getDirections().size() == 0){
            //inner.add(stap);
            return stap;
        }
        if (stap.getDirections().size() == 1){
            inner.add(stap.getDirections().get(0).getName());
            return getBestDir(stap.getDirections().get(0));
        }
        else if (stap.getDirections().size() == 2){
            inner.add(compareTo(stap.getDirections().get(0),stap.getDirections().get(1)).getName());
            return getBestDir(compareTo(stap.getDirections().get(0),stap.getDirections().get(1)));
        }
        else{
            Stap best = compareTo(stap.getDirections().get(0),stap.getDirections().get(1));
            for (int a=1;a<stap.getDirections().size()-1;a++) {
                best = compareTo(best,stap.getDirections().get(a));
            }
            inner.add(best.getName());
            return getBestDir(best);
        }

    }

    public Stap compareTo(Stap stap1, Stap stap2) {
        if (stap1.getAfstand() < stap2.getAfstand()){
            return stap1;
        }
        else if(stap1.getAfstand() > stap2.getAfstand()){
            return stap2;
        }
        else{return stap1;}

    }
    public Stap compareTo(Stap stap1, Stap stap2,Boolean inverted) {
        if (stap1.getAfstand() > stap2.getAfstand()){
            return stap1;
        }
        else if(stap1.getAfstand() < stap2.getAfstand()){
            return stap2;
        }
        else{return stap1;}

    }
}
