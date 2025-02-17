package question7;

import java.util.Random;
import java.math.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {
    
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanf = new Scanner(System.in);

        // quantas vezes a simulação acontecerá
        int times = 0, count = 0;
        while (times == 0) {

            try {
                System.err.println("Quantas vezes deseja realizar a simulação? ");
                times = scanf.nextInt();
                
            } catch (Exception NumberFormatException) {
                System.err.println("Formato inválido.");
                scanf.nextLine();
            }
        }

        for (int i = 0; i < times; i++) {
            
            float X = rand.nextFloat(); // retorna valor aleatório entre 0 e 1
            float Y = rand.nextFloat(); // retorna valor aleatório entre 0 e 1   
    
            while (X == Y) {
                Y = rand.nextFloat();
            }

            System.err.println("Valores sorteados: " + X + " - " + Y);
            float result = (float) Math.sqrt((Math.pow(X, 2)) + (Math.pow(Y, 2)));
            System.err.println("Resultado: " + result);

            if ( result < 1) {
                System.err.println("Valor de PI encontrado: " + result * 4);
                System.err.println("-------------------------------------------");
                count++;
            } else {
                System.err.println("Valor de PI não encontrado :( - " + result * 4);
                System.err.println("-------------------------------------------");
            }
        }

        System.out.println("Vezes que atendeu-se a condição: " + count);
        System.out.println("Valor de PI encontrado: " + (float)count * 4 / times);

        scanf.close();
    }
}

