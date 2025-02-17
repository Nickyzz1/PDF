import java.util.HashSet;

public class NumberSet extends Set
{
    private HashSet<Double> Dados;

    public NumberSet(Double[] Numeros)
    {
        Dados = new HashSet<>();
        for(int i = 0; i < Numeros.length; i++)
        {
            Dados.add(Numeros[i]);
        }
    }

    public boolean contains(Double dois)
    {
        return Dados.contains(dois);
    }
}
