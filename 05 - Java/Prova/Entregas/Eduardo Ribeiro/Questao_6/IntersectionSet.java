package Prova.Questao_6;

public class IntersectionSet extends Set
{
    private Set S1, S2;
    public IntersectionSet(Set S1, Set S2)
    {
        this.S1 = S1;
        this.S2 = S2;
    }
    public boolean contains(Double d)
    {
        return (S1.contains(d) && S2.contains(d));
    }
}