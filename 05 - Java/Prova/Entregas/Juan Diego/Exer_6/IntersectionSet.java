package Exer_6;

import java.util.HashSet;

public class IntersectionSet  extends Set{

    NumberSet intersection;

    IntersectionSet(NumberSet a,NumberSet b){

        
        HashSet<Float> hashSet = a.getHash();

        for( Float i : hashSet){
            if ( b.contains(i)){
                intersection.add(i);
            }

        }

    } 

    @Override
    public boolean contains(float value) {
        if(intersection.contains(value))
            return true;

        return false;
    }

}
