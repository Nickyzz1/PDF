package Trem;

public class main {
    public static void main(String[] args) {
        
        Trem trem = new Trem();
        trem.Add("Combustivel");
        Vagao Primeiro = trem.getPrimeiroVagao();

        System.out.println(Primeiro.getTipo());
    }
}
