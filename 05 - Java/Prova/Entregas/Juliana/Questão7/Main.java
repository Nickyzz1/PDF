package Questão7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos pontos será necessario para a simulacao?");

        try {
            int num = scanner.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Formato de número invalido!");
        
        } System.out.println("Sempre executado");

        int []x = new int[num];
        int []y = new int[num];
        int []reslt = new int[num];
        
        for (int i = 0; i < num; i++) {

            int j = rand.nextInt(2);  
            int c = rand.nextInt(2);
            
            x[i] = j;
            y[i] = c;

            x[i] = Math.pow(i, 2);
            y[i] = Math.pow(i, 2);

            result[i] = x[i] + y[i];
            
            result[i] = Math.sqrt(reslt[i]);

            if (result[i] > 1) {
                result[i] = result[i];
            }

            result[i] += result[i];
        
            int resultado = result[i* 4];
        }

        System.out.println(resultado);

    }
}
