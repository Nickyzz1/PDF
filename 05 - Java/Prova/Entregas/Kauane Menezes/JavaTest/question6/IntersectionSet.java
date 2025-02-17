package question6;

import java.util.ArrayList;

public class IntersectionSet extends Set {
    
    ArrayList<Float> intersetcion;
    Set setA;
    Set setB;
    
    IntersectionSet(Set setA, Set setB) {
        this.setA = setA;
        this.setB = setB;
    }

    public boolean intersect(float num) {

        if (setA.contains(num) && setB.contains(num)) {
            intersetcion.add(num);
            return true;
        }
        return false;
    }

    @Override
    boolean contains(Float num) {
        return (intersetcion.contains(num)) ? true : false;
    }
    
}
