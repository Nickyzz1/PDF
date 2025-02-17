package Prova;

//import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Quest7 {
    public static void main(String[] args) {
        Random rand = new Random();

        double x;
        double y;
        double raizSoma;
        double pi;
        int qtdPontos = 0;

        try {
            System.out.println("Digite a quantidade de pontos que deseja para realizar a simulaçao: ");
            Scanner scanner = new Scanner(System.in);
            qtdPontos = scanner.nextInt();
            scanner.close();

        }catch(NumberFormatException exception) {
            System.err.println("O valor digitado é inválido!");
        }

        for(int i = 0; i < qtdPontos; i++ ){
            x = rand.nextFloat();
            y = rand.nextFloat();

            raizSoma = ( Math.sqrt(Math.pow(x, 2)) + Math.sqrt(Math.pow(y, 2)) );

            if(raizSoma < 1 ){
                pi = raizSoma * 4;
                System.out.println("O valores de X e Y são menores que 1, logo ficou:" + pi);
            }
            else{
                System.out.println("Os valores de X e Y não são menores que 1");
            }

        }
    }
}
