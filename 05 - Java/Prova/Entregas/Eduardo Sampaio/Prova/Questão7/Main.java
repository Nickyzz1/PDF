package Questão7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int user;
        Float x, y;
        Float result = new Float(0);
        
        while (true) {
            try{
                System.err.println("Quantos pontos serao utilizados na Simulaçao:\n");
                user = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Valor inválido!");
                scan.reset();
            }
        }

        for(int i = 0; i < user; i++)
        {
            x = rand.nextFloat();
            y = rand.nextFloat();

            if(Math.sqrt((x * x) + (y * y)) < 1)
                result++;
        }

        result *= 4;

        System.err.printf("Resultado: %.0f", result);

        scan.close();
    }
}
