package question8;

public class Main {
    
    public static void main(String[] args) {
        
        // instacia um trem
        Train trembão = new Train();

        // printa os possíveis conteúdos que os vagões podem ter
        System.out.println("Conteúdos disponíveis para o trem: ");

        for (@SuppressWarnings("rawtypes") Enum contents : TrainContent.values()) {
            System.out.println(contents);
        }

        // adiciona no trem
        trembão.add(TrainContent.VAZIO, 0);
        trembão.add(TrainContent.ANIMAIS, 1);
        trembão.add(TrainContent.GASOLINA, 2);

        for (int i = 3; i < 10; i++) {
            trembão.add(TrainContent.PASSAGEIROS, i);

        }

        // conta quantos passageiros constam no trem
        System.err.println("Quantidade de passageiros no trem: ");
        System.out.println(trembão.count(TrainContent.PASSAGEIROS));

        System.out.println("Vagões do trem: ");
        trembão.display();

    }

}
