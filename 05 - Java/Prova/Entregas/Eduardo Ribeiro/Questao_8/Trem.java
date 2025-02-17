package Prova.Questao_8;

public class Trem
{
    private int Vagoes = 0;
    private Vagao Primeiro = null;

    public int Count(TrainContent Carga)
    {
        Vagao V = Primeiro;
        int count = 0;
        for(int i = 0; i < Vagoes; ++i)
        {
            if(V.getCarga().equals(Carga))
            {
                ++count;
            }
            V = V.getProximo();
        }
        return count;
    }

    public void Add(TrainContent Carga)
    {
        if(Vagoes == 0)
        {
            ++Vagoes;
            Primeiro = new Vagao(Carga);
            return;
        }
        Vagao V = Primeiro;
        for(int i = 1; i < Vagoes; ++i)
        {
            V = V.getProximo();
        }
        ++Vagoes;
        Vagao Novo = new Vagao(Carga);
        Novo.setAnterior(V);
        V.setProximo(Novo);
    }
}