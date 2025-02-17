package Questão6;

import java.util.HashSet;

public class NumberSet extends Set
{
    private HashSet<Double> hash;
    
    
    NumberSet()
    {
        hash = new HashSet<Double>();
    }

    NumberSet(Float value)
    {
        hash = new HashSet<Double>();
        add(value);
    }

    @Override
    boolean contains(Float value) {

        return(hash.contains(value.doubleValue()));
    }

    void add(Float value)
    {
        if(!contains(value))
            hash.add(value.doubleValue());
        else
            System.err.println("Valor Já Adicionado");
    }
}
