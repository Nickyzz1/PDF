import java.util.HashSet;

class IntersectionSet extends Set
{
    HashSet<Double> set1;
    HashSet<Double> set2;
    IntersectionSet()
    {
        set1 = new HashSet<>();
        set2 = new HashSet<>();
    }

    @Override
    boolean contains(float value) 
    {return false;}

    
    boolean containsTwo(float value1, float value2)
    {
        return set1.contains(value1) && set2.contains(value2);
    }
}
