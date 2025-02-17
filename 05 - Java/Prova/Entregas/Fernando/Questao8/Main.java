package Questao8;

public class Main {
    public static void main(String[] args) {
        Trem trem = new Trem();
        trem.Add(TrainContent.Vazio);
        trem.Add(TrainContent.Combustivel);
        trem.Add(TrainContent.Trigo);
        trem.Add(TrainContent.Combustivel);
        trem.Add(TrainContent.Animais);
        trem.Add(TrainContent.Combustivel);
        trem.Add(TrainContent.Passageiros);

        System.out.println(trem.count(TrainContent.Combustivel));
    }
}
