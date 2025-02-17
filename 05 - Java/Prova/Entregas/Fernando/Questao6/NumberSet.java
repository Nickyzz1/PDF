package Questao6;

import java.util.HashSet;
import java.util.Iterator;

public class NumberSet extends Set {

    public HashSet<Double> hash = new HashSet<>();
    Iterator<Double> iterator = hash.iterator();

    @Override
    public void Add(Double num){
        hash.add(num);
    }

    @Override
    boolean contains(Double num) {
        return hash.contains(num);
    }

    @Override
    int getSize() {
        return hash.size();
    }

    @Override
    double next() {
        return iterator.next();
    }
    
}
