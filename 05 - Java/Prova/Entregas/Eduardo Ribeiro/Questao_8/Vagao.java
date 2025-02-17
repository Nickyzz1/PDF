package Prova.Questao_8;

public class Vagao
{
    private TrainContent Carga;
    private Vagao Proximo = null, Anterior = null;

    public Vagao(TrainContent Carga)
    {
        this.Carga = Carga;
    }

    public TrainContent getCarga(){return Carga;}
    public void setCarga(TrainContent Carga){this.Carga = Carga;}

    public Vagao getProximo(){return Proximo;}
    public void setProximo(Vagao Proximo){this.Proximo = Proximo;}

    public Vagao getAnterior(){return Anterior;}
    public void setAnterior(Vagao Anterior){this.Anterior = Anterior;}
}