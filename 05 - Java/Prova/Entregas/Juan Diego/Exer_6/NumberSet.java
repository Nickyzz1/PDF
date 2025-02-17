package Exer_6;

import java.util.HashSet;


public class NumberSet extends Set{

    HashSet<Float> hash = new HashSet<Float>();

    public void add(Float value){

        hash.add(value);

    }

    HashSet<Float> getHash() {
        return hash;
    }

    @Override
    public boolean contains(float value) {
        if(hash.contains(value))
            return true;
        return false;
    }
    
    
}
