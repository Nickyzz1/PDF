package Prova.questao6;

public class NumberSet extends Set {
    private Set elements;
    private int i = 0;
    
    public NumberSet() {
        // elements = new Hash<>();
    }

    @Override
    public boolean contains(Float element) {
        return elements.contains(element);
    }
    
    public void add(Double element) {
        Hash<Double> hash = new Hash<>();
        hash.add(i, element);
        i++;
    }
}
