import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;

        System.out.println("Digite a quantidade de pontos para realizar a simulacao:");

        try 
        {
            n = scanner.nextInt();
            
            double squareSum;
            double result;
            
            for(int i = 0; i < n; i++)
                {
                    double x = random.nextFloat();    
                    double y = random.nextFloat();

                    squareSum = Math.pow(x, 2) + Math.pow(y, 2); 
                    result = Math.sqrt(squareSum);

                    if (result < 1) 
                    {
                        double pi = result * 4;
                        System.out.println("Valor aproximado de Pi: " + pi);
                    }
                }
            scanner.close();
        }

            catch (InputMismatchException  e) 
            {
                System.out.println("Voce deve digitar um numero inteiro positivo");
            } 

            catch (NumberFormatException e)
            {
                System.out.println("Voce deve digitar um numero inteiro positivo");
            }  
    }
}

