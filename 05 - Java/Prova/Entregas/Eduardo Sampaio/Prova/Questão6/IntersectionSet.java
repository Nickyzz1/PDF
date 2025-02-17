package Questão6;

public class IntersectionSet extends Set
{
    private Set set1;
    private Set set2;

    IntersectionSet(Set set1, Set set2)
    {
        set1 = this.set1;
        set2 = this.set2;
    }

    @Override
    boolean contains(Float value) {
        return (set1.contains(value) && set2.contains(value));
    }
    
}
