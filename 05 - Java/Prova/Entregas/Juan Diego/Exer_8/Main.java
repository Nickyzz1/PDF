package Exer_8;

public class Main {
    public static void main(String[] args) {
        
        Train trem = new Train();

        trem.Add(TrainContent.Empity);
        trem.Add(TrainContent.Combus);
        trem.Add(TrainContent.Trigo);
        trem.Add(TrainContent.Animais);
        trem.Add(TrainContent.Passageiros);
        trem.Add(TrainContent.Empity);
        trem.Add(TrainContent.Empity);

        System.err.println(trem.count(TrainContent.Empity));
        

    }


}
