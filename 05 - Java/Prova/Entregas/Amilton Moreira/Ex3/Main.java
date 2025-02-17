package Ex3;
import java.util.Scanner;

public class Main 
{
    static Scanner scanner = new Scanner(System.in);
    
    static Boolean imparPar(int num)
    {
        if (num % 2 == 0)
        {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        System.out.printf("Digite um numero!\n");
        int num = scanner.nextInt();
        System.err.println(imparPar(num));
    }
}
