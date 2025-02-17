package Prova.Questao_6;

import java.util.HashSet;

public class NumberSet extends Set
{
    private HashSet<Double> Data;

    public NumberSet(Double[] Numbers)
    {
        Data = new HashSet<>();
        for(int i = 0; i < Numbers.length; ++i)
        {
            Data.add(Numbers[i]);
        }
    }

    public boolean contains(Double d)
    {
        return Data.contains(d);
    }
}
