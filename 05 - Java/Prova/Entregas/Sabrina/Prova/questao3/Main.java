package Prova.questao3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ParImpar parImpar = new ParImpar();
        Scanner scanner = new Scanner(System.in);
        boolean saida;
        
        System.out.println("Insira um numero para conferir se e par ou impar: ");
        int num = scanner.nextInt();

        
        saida = parImpar.conferir(num);
        if(saida) {
            System.out.println("O numero inserido e par");
        }
        else {
            System.out.println("O numero inserido e impar");
        }

        scanner.close();
    }


}
