package Prova.questao8;

public class Main {
    public static void main(String[] args) {
        Trem trem = new Trem();
        trem.add(TrainContent.COMBUSTIVEL);
        trem.add(TrainContent.TRIGO);
        trem.add(TrainContent.ANIMAIS);
        trem.add(TrainContent.PASSAGEIROS);
        trem.add(TrainContent.COMBUSTIVEL);

        System.out.println("Quantidade de vagoes de combustível: " + trem.count(TrainContent.COMBUSTIVEL));
        System.out.println("Quantidade de vagoes de passageiros: " + trem.count(TrainContent.PASSAGEIROS));
    
    }
}
