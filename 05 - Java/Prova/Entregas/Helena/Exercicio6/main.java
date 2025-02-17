package Exercicio6;

public class main {
    
    public static void main(String[] args) {

        Set ListaInt = new Set(10);

        for (int i = 1; i <= 10; i++) {
            ListaInt.add(i);
        }

        System.out.println(ListaInt.Contains(1));
    }
}
