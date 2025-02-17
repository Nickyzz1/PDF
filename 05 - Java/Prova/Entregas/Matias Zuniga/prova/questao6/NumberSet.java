import java.util.HashSet;

class NumberSet extends Set 
{
    HashSet<Double> hash = new HashSet<>();

    @Override
    boolean contains(float value) 
    {
       return hash.contains(value);
    }
    
}
