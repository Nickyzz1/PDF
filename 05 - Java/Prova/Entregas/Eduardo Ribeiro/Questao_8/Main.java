package Prova.Questao_8;

public class Main
{
    public static void main(String[] args)
    {
        Trem Trem1 = new Trem();
        Trem1.Add(TrainContent.Animais);
        Trem1.Add(TrainContent.Trigo);
        Trem1.Add(TrainContent.Animais);
        Trem1.Add(TrainContent.Passageiros);
        Trem1.Add(TrainContent.Vazio);
        Trem1.Add(TrainContent.Animais);
        Trem1.Add(TrainContent.Combustivel);

        System.out.println(Trem1.Count(TrainContent.Animais));
    }
}