package Ex7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
    static Random rand = new Random();
    public static void main(String[] args) 
    {
        float x = rand.nextFloat();
        float y = rand.nextFloat();
        float n = 0, pi = 0;
                
        Scanner scanner = new Scanner(System.in);
        int limite = 0;

        System.out.println("Digite um numero de vezes que a simulacao de PI ira rodar!");

        try 
        {
            limite = scanner.nextInt();
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Erro ao identificar numero!");
        }

        for (int i = 0; i < limite; i ++)
        {
            x = rand.nextFloat();
            y = rand.nextFloat();
            x = x * x;
            y = y * y;

            n = x + y;
            pi = (4 * x)/ n;
        }

        System.out.println(pi);

        scanner.close();
    }
}
