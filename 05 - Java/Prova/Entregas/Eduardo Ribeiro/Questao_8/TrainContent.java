package Prova.Questao_8;

public enum TrainContent
{
    Vazio(0), Combustivel(1), Trigo(2), Animais(3), Passageiros(4);
    private int n;
    private TrainContent(int n)
    {
        this.n = n;
    }
    public int getID()
    {
        return n;
    }
}