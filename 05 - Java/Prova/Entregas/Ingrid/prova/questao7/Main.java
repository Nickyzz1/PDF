package prova.questao7;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Random rand = new Random();
        float value = rand.nextFloat(); // retorna valor aleatório entre 0 e 1

        Scanner scanner = new Scanner(System.in);
        int qtdPontos = scanner.nextInt();

        float[] pontosX;
        float[] pontosY;

        System.out.println("Digite a quantidade de pontos desejada: ");
        scanner.nextInt(qtdPontos);

        for (int i = 0; i < qtdPontos; i++) {
            float x = rand.nextFloat();
            float y = rand.nextFloat();

            pontosX[i] = x;
            pontosY[i] = y;

            if(
                
                (pontosX[i]^2) + (pontosY[i]^2) < 1
            )
        }

    }
}
