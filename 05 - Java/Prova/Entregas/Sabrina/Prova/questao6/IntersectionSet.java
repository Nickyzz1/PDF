package Prova.questao6;

public class IntersectionSet extends Set {
    private Set set1;
    private Set set2;

    public IntersectionSet(Set set1, Set set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    @Override
    public boolean contains(Float element) {
        return true;
    }
}
